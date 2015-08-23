package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Movies2directors;
import liquibasedemo.data.Movies2directorsId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Movies2directors.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Movies2directors
 */

public class Movies2directorsHome {

    private static final Log log = LogFactory
            .getLog(Movies2directorsHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Movies2directors transientInstance) {
        log.debug("persisting Movies2directors instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Movies2directors persistentInstance) {
        log.debug("removing Movies2directors instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Movies2directors merge(Movies2directors detachedInstance) {
        log.debug("merging Movies2directors instance");
        try {
            Movies2directors result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Movies2directors findById(Movies2directorsId id) {
        log.debug("getting Movies2directors instance with id: " + id);
        try {
            Movies2directors instance = entityManager.find(
                    Movies2directors.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
