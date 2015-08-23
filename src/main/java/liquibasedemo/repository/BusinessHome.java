package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Business;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Business.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Business
 */

public class BusinessHome {

    private static final Log log = LogFactory.getLog(BusinessHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Business transientInstance) {
        log.debug("persisting Business instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Business persistentInstance) {
        log.debug("removing Business instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Business merge(Business detachedInstance) {
        log.debug("merging Business instance");
        try {
            Business result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Business findById(int id) {
        log.debug("getting Business instance with id: " + id);
        try {
            Business instance = entityManager.find(Business.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
