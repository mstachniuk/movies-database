package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Movies2composers;
import liquibasedemo.data.Movies2composersId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Movies2composers.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Movies2composers
 */

public class Movies2composersHome {

    private static final Log log = LogFactory
            .getLog(Movies2composersHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Movies2composers transientInstance) {
        log.debug("persisting Movies2composers instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Movies2composers persistentInstance) {
        log.debug("removing Movies2composers instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Movies2composers merge(Movies2composers detachedInstance) {
        log.debug("merging Movies2composers instance");
        try {
            Movies2composers result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Movies2composers findById(Movies2composersId id) {
        log.debug("getting Movies2composers instance with id: " + id);
        try {
            Movies2composers instance = entityManager.find(
                    Movies2composers.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
