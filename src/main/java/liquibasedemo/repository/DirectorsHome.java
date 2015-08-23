package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Directors;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Directors.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Directors
 */

public class DirectorsHome {

    private static final Log log = LogFactory.getLog(DirectorsHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Directors transientInstance) {
        log.debug("persisting Directors instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Directors persistentInstance) {
        log.debug("removing Directors instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Directors merge(Directors detachedInstance) {
        log.debug("merging Directors instance");
        try {
            Directors result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Directors findById(Integer id) {
        log.debug("getting Directors instance with id: " + id);
        try {
            Directors instance = entityManager.find(Directors.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
