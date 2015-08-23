package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Ratings;
import liquibasedemo.data.RatingsId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Ratings.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Ratings
 */

public class RatingsHome {

    private static final Log log = LogFactory.getLog(RatingsHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Ratings transientInstance) {
        log.debug("persisting Ratings instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Ratings persistentInstance) {
        log.debug("removing Ratings instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Ratings merge(Ratings detachedInstance) {
        log.debug("merging Ratings instance");
        try {
            Ratings result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Ratings findById(RatingsId id) {
        log.debug("getting Ratings instance with id: " + id);
        try {
            Ratings instance = entityManager.find(Ratings.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
