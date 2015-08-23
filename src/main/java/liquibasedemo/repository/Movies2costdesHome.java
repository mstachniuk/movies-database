package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Movies2costdes;
import liquibasedemo.data.Movies2costdesId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Movies2costdes.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Movies2costdes
 */

public class Movies2costdesHome {

    private static final Log log = LogFactory.getLog(Movies2costdesHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Movies2costdes transientInstance) {
        log.debug("persisting Movies2costdes instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Movies2costdes persistentInstance) {
        log.debug("removing Movies2costdes instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Movies2costdes merge(Movies2costdes detachedInstance) {
        log.debug("merging Movies2costdes instance");
        try {
            Movies2costdes result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Movies2costdes findById(Movies2costdesId id) {
        log.debug("getting Movies2costdes instance with id: " + id);
        try {
            Movies2costdes instance = entityManager.find(Movies2costdes.class,
                    id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
