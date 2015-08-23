package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Movies2writers;
import liquibasedemo.data.Movies2writersId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Movies2writers.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Movies2writers
 */

public class Movies2writersHome {

    private static final Log log = LogFactory.getLog(Movies2writersHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Movies2writers transientInstance) {
        log.debug("persisting Movies2writers instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Movies2writers persistentInstance) {
        log.debug("removing Movies2writers instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Movies2writers merge(Movies2writers detachedInstance) {
        log.debug("merging Movies2writers instance");
        try {
            Movies2writers result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Movies2writers findById(Movies2writersId id) {
        log.debug("getting Movies2writers instance with id: " + id);
        try {
            Movies2writers instance = entityManager.find(Movies2writers.class,
                    id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
