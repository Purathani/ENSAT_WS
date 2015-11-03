/*
 * Service class to AccBiomaterial
 */
package unimelb.ensat.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.PathSegment;
import unimelb.ensat.config.Ensat_Constants;
import unimelb.ensat.entity.AccBiomaterial;
import unimelb.ensat.entity.AccBiomaterialPK;

/**
 *
 * @author purat
 */
@Stateless
@Path(Ensat_Constants.ACC_BIO_MATERIAL_PATH)
public class AccBiomaterialFacadeREST extends AbstractFacade<AccBiomaterial> {
    @PersistenceContext(unitName = Ensat_Constants.PERSIST_CONTEXT_UNIT)
    private EntityManager em;

    private AccBiomaterialPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;accBiomaterialId=accBiomaterialIdValue;ensatId=ensatIdValue;centerId=centerIdValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        unimelb.ensat.entity.AccBiomaterialPK key = new unimelb.ensat.entity.AccBiomaterialPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> accBiomaterialId = map.get("accBiomaterialId");
        if (accBiomaterialId != null && !accBiomaterialId.isEmpty()) {
            key.setAccBiomaterialId(new java.lang.Integer(accBiomaterialId.get(0)));
        }
        java.util.List<String> ensatId = map.get("ensatId");
        if (ensatId != null && !ensatId.isEmpty()) {
            key.setEnsatId(new java.lang.Integer(ensatId.get(0)));
        }
        java.util.List<String> centerId = map.get("centerId");
        if (centerId != null && !centerId.isEmpty()) {
            key.setCenterId(centerId.get(0));
        }
        return key;
    }

    /**
     * Constructor
     */
    public AccBiomaterialFacadeREST() {
        super(AccBiomaterial.class);
    }

    /**
     * Create AccBiomaterial
     * @param entity 
     */
    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(AccBiomaterial entity) {
        super.create(entity);
    }

    /**
     * Update AccBiomaterial by id
     * @param id
     * @param entity 
     */
    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") PathSegment id, AccBiomaterial entity) {
        super.edit(entity);
    }

    /**
     * Delete AccBiomaterial
     * @param id 
     */
    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        unimelb.ensat.entity.AccBiomaterialPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    /**
     * get AccBiomaterial by id
     * @param id
     * @return 
     */
    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public AccBiomaterial find(@PathParam("id") PathSegment id) {
        unimelb.ensat.entity.AccBiomaterialPK key = getPrimaryKey(id);
        return super.find(key);
    }

    /**
     * get all AccBiomaterial
     * @return 
     */
    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<AccBiomaterial> findAll() {
        return super.findAll();
    }

    /**
     * get AccBiomaterial by id range
     * @param from
     * @param to
     * @return 
     */
    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<AccBiomaterial> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    /**
     * get records count
     * @return 
     */
    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
