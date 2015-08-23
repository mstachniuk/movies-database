package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Cinematgrs;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Cinematgrs.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Cinematgrs
 */

public class CinematgrsHome {

    private static final Log log = LogFactory.getLog(CinematgrsHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Cinematgrs transientInstance) {
        log.debug("persisting Cinematgrs instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Cinematgrs persistentInstance) {
        log.debug("removing Cinematgrs instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Cinematgrs merge(Cinematgrs detachedInstance) {
        log.debug("merging Cinematgrs instance");
        try {
            Cinematgrs result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Cinematgrs findById(Integer id) {
        log.debug("getting Cinematgrs instance with id: " + id);
        try {
            Cinematgrs instance = entityManager.find(Cinematgrs.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
