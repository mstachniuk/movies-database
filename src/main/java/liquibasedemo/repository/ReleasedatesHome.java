package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Releasedates;
import liquibasedemo.data.ReleasedatesId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Releasedates.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Releasedates
 */

public class ReleasedatesHome {

    private static final Log log = LogFactory.getLog(ReleasedatesHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Releasedates transientInstance) {
        log.debug("persisting Releasedates instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Releasedates persistentInstance) {
        log.debug("removing Releasedates instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Releasedates merge(Releasedates detachedInstance) {
        log.debug("merging Releasedates instance");
        try {
            Releasedates result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Releasedates findById(ReleasedatesId id) {
        log.debug("getting Releasedates instance with id: " + id);
        try {
            Releasedates instance = entityManager.find(Releasedates.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
