package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Writers;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Writers.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Writers
 */

public class WritersHome {

    private static final Log log = LogFactory.getLog(WritersHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Writers transientInstance) {
        log.debug("persisting Writers instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Writers persistentInstance) {
        log.debug("removing Writers instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Writers merge(Writers detachedInstance) {
        log.debug("merging Writers instance");
        try {
            Writers result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Writers findById(Integer id) {
        log.debug("getting Writers instance with id: " + id);
        try {
            Writers instance = entityManager.find(Writers.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
