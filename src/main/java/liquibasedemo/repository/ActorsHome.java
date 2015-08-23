package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Actor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Actor.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Actor
 */
@Repository
public class ActorsHome {

    private static final Log log = LogFactory.getLog(ActorsHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Actor transientInstance) {
        log.debug("persisting Actor instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Actor persistentInstance) {
        log.debug("removing Actor instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Actor merge(Actor detachedInstance) {
        log.debug("merging Actor instance");
        try {
            Actor result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Actor findById(Integer id) {
        log.debug("getting Actor instance with id: " + id);
        try {
            Actor instance = entityManager.find(Actor.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
