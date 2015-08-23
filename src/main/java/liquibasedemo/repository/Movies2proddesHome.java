package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Movies2proddes;
import liquibasedemo.data.Movies2proddesId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Movies2proddes.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Movies2proddes
 */

public class Movies2proddesHome {

    private static final Log log = LogFactory.getLog(Movies2proddesHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Movies2proddes transientInstance) {
        log.debug("persisting Movies2proddes instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Movies2proddes persistentInstance) {
        log.debug("removing Movies2proddes instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Movies2proddes merge(Movies2proddes detachedInstance) {
        log.debug("merging Movies2proddes instance");
        try {
            Movies2proddes result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Movies2proddes findById(Movies2proddesId id) {
        log.debug("getting Movies2proddes instance with id: " + id);
        try {
            Movies2proddes instance = entityManager.find(Movies2proddes.class,
                    id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
