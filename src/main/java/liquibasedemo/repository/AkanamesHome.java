package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Akanames;
import liquibasedemo.data.AkanamesId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Akanames.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Akanames
 */

public class AkanamesHome {

    private static final Log log = LogFactory.getLog(AkanamesHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Akanames transientInstance) {
        log.debug("persisting Akanames instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Akanames persistentInstance) {
        log.debug("removing Akanames instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Akanames merge(Akanames detachedInstance) {
        log.debug("merging Akanames instance");
        try {
            Akanames result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Akanames findById(AkanamesId id) {
        log.debug("getting Akanames instance with id: " + id);
        try {
            Akanames instance = entityManager.find(Akanames.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
