/*
 * JAVA-RS config class
 */
package unimelb.ensat.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author purat
 */
@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(unimelb.ensat.service.AccBiomaterialAliquotsTransferFacadeREST.class);
        resources.add(unimelb.ensat.service.AccBiomaterialFacadeREST.class);
    }
    
}
