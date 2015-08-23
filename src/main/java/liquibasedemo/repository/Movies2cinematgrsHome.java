package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Movies2cinematgrs;
import liquibasedemo.data.Movies2cinematgrsId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Movies2cinematgrs.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Movies2cinematgrs
 */

public class Movies2cinematgrsHome {

    private static final Log log = LogFactory
            .getLog(Movies2cinematgrsHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Movies2cinematgrs transientInstance) {
        log.debug("persisting Movies2cinematgrs instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Movies2cinematgrs persistentInstance) {
        log.debug("removing Movies2cinematgrs instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Movies2cinematgrs merge(Movies2cinematgrs detachedInstance) {
        log.debug("merging Movies2cinematgrs instance");
        try {
            Movies2cinematgrs result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Movies2cinematgrs findById(Movies2cinematgrsId id) {
        log.debug("getting Movies2cinematgrs instance with id: " + id);
        try {
            Movies2cinematgrs instance = entityManager.find(
                    Movies2cinematgrs.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
