package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Composers;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Composers.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Composers
 */

public class ComposersHome {

    private static final Log log = LogFactory.getLog(ComposersHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Composers transientInstance) {
        log.debug("persisting Composers instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Composers persistentInstance) {
        log.debug("removing Composers instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Composers merge(Composers detachedInstance) {
        log.debug("merging Composers instance");
        try {
            Composers result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Composers findById(Integer id) {
        log.debug("getting Composers instance with id: " + id);
        try {
            Composers instance = entityManager.find(Composers.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
