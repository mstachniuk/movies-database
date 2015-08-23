package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Movies2misc;
import liquibasedemo.data.Movies2miscId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Movies2misc.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Movies2misc
 */

public class Movies2miscHome {

    private static final Log log = LogFactory.getLog(Movies2miscHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Movies2misc transientInstance) {
        log.debug("persisting Movies2misc instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Movies2misc persistentInstance) {
        log.debug("removing Movies2misc instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Movies2misc merge(Movies2misc detachedInstance) {
        log.debug("merging Movies2misc instance");
        try {
            Movies2misc result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Movies2misc findById(Movies2miscId id) {
        log.debug("getting Movies2misc instance with id: " + id);
        try {
            Movies2misc instance = entityManager.find(Movies2misc.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
