package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Movies2producers;
import liquibasedemo.data.Movies2producersId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Movies2producers.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Movies2producers
 */

public class Movies2producersHome {

    private static final Log log = LogFactory
            .getLog(Movies2producersHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Movies2producers transientInstance) {
        log.debug("persisting Movies2producers instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Movies2producers persistentInstance) {
        log.debug("removing Movies2producers instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Movies2producers merge(Movies2producers detachedInstance) {
        log.debug("merging Movies2producers instance");
        try {
            Movies2producers result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Movies2producers findById(Movies2producersId id) {
        log.debug("getting Movies2producers instance with id: " + id);
        try {
            Movies2producers instance = entityManager.find(
                    Movies2producers.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
