package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Locations;
import liquibasedemo.data.LocationsId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Locations.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Locations
 */

public class LocationsHome {

    private static final Log log = LogFactory.getLog(LocationsHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Locations transientInstance) {
        log.debug("persisting Locations instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Locations persistentInstance) {
        log.debug("removing Locations instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Locations merge(Locations detachedInstance) {
        log.debug("merging Locations instance");
        try {
            Locations result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Locations findById(LocationsId id) {
        log.debug("getting Locations instance with id: " + id);
        try {
            Locations instance = entityManager.find(Locations.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
