/*
 * Service class to AccBiomaterialDetails
 */
package unimelb.ensat.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import unimelb.ensat.config.Ensat_Constants;
import unimelb.ensat.entity.AccBiomaterialAliquotsTransfer;
import unimelb.ensat.entity.AccBiomaterialDetails;

/**
 *
 * @author purat
 */
@Stateless
@Path(Ensat_Constants.ACC_BIO_TRSF_PATH)
public class AccBiomaterialAliquotsTransferFacadeREST extends AbstractFacade<AccBiomaterialDetails> {

    @PersistenceContext(unitName = Ensat_Constants.PERSIST_CONTEXT_UNIT)
    private EntityManager em;

    /**
     * Constructor
     */
    public AccBiomaterialAliquotsTransferFacadeREST() {
        super(AccBiomaterialDetails.class);
    }

    /**
     * Create AccBiomaterialDetails
     *
     * @param entity
     */
    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(AccBiomaterialDetails entity) {
        super.create(entity);
    }

    /**
     * Update AccBiomaterialAliquotsTransfer status eg. RECEIVED , PENDING
     *
     * @param id
     * @param status
     * @return SUCCESS / FAILED message
     */
    @GET
    @Path("{id}/{status}")
    @Consumes({"application/xml", "application/json"})
    public String edit(@PathParam("id") Integer id, @PathParam("status") String status) {
        String result = Ensat_Constants.SUCCESS;
        try {
            AccBiomaterialAliquotsTransfer transfer = getEntityManager().find(AccBiomaterialAliquotsTransfer.class, id);
            transfer.setStatus(status);
            getEntityManager().merge(transfer);
        } catch (Exception e) {
            result = Ensat_Constants.ERROR + " : "+ e.getMessage();
        }
        return result;
    }

    /**
     * Delete entity
     *
     * @param id
     */
    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    /**
     * get AccBiomaterialDetails based on group id
     *
     * @param id
     * @return
     */
    @GET
    @Path("{id}")
    @Produces("application/json")
    public List<AccBiomaterialDetails> find(@PathParam("id") Integer id) {
        /*  String queryStr
         = "SELECT NEW unimelb.ensat.entity.AccBiomaterialDetails(B.accBiomaterialPK.ensatId, F.bioId , B.biomaterialDate , F.material, F.aliquotSequenceId, F.freezerNumber, F.freezershelfNumber, F.rackNumber, F.shelfNumber,F.boxNumber, F.positionNumber ,F.accBiomaterialFreezerInformationPK.centerId ) "
         + "FROM AccBiomaterial as B left join AccBiomaterialFreezerInformation as F ON"
         + " B.accBiomaterialPK.accBiomaterialId = F.accBiomaterialFreezerInformationPK.accBiomaterialId AND B.accBiomaterialPK.centerId = F.accBiomaterialFreezerInformationPK.centerId AND B.accBiomaterialPK.ensatId = F.accBiomaterialFreezerInformationPK.ensatId ";
         */
        List<AccBiomaterialDetails> results = null;
        try {
            String queryStr
                    = "SELECT NEW unimelb.ensat.entity.AccBiomaterialDetails(B.accBiomaterialPK.ensatId, F.bioId , "
                    + "B.biomaterialDate , F.material, F.aliquotSequenceId, F.freezerNumber, F.freezershelfNumber, "
                    + "F.rackNumber, F.shelfNumber,F.boxNumber, F.positionNumber ,F.accBiomaterialFreezerInformationPK.centerId, "
                    + "T.destinationCenterId, T.transferedDate, T.status , T.accBiomaterialTransferGroupId, T.accBiomaterialTransferId ) "
                    + "FROM AccBiomaterialFreezerInformation as F left join AccBiomaterialAliquotsTransfer as T ON "
                    + " T.accBiomaterialLocationId = F.accBiomaterialFreezerInformationPK.accBiomaterialLocationId AND T.accBiomaterialId = F.accBiomaterialFreezerInformationPK.accBiomaterialId AND T.centerId = F.accBiomaterialFreezerInformationPK.centerId AND T.ensatId = F.accBiomaterialFreezerInformationPK.ensatId "
                    + " left join AccBiomaterial as B ON"
                    + " B.accBiomaterialPK.accBiomaterialId = F.accBiomaterialFreezerInformationPK.accBiomaterialId AND B.accBiomaterialPK.centerId = F.accBiomaterialFreezerInformationPK.centerId AND B.accBiomaterialPK.ensatId = F.accBiomaterialFreezerInformationPK.ensatId "
                    + " WHERE T.accBiomaterialTransferGroupId = ?1 ";

            TypedQuery<AccBiomaterialDetails> query
                    = em.createQuery(queryStr, AccBiomaterialDetails.class).setParameter(1, id);
            results = query.getResultList();

        } catch (Exception e) {
        }
        return results;
    }

    /**
     * get all AccBiomaterialDetails records
     * @return 
     */
    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<AccBiomaterialDetails> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<AccBiomaterialDetails> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

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
