package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Producers;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Producers.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Producers
 */

public class ProducersHome {

    private static final Log log = LogFactory.getLog(ProducersHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Producers transientInstance) {
        log.debug("persisting Producers instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Producers persistentInstance) {
        log.debug("removing Producers instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Producers merge(Producers detachedInstance) {
        log.debug("merging Producers instance");
        try {
            Producers result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Producers findById(Integer id) {
        log.debug("getting Producers instance with id: " + id);
        try {
            Producers instance = entityManager.find(Producers.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
