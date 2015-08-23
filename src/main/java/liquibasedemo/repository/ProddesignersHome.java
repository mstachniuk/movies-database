package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Proddesigners;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Proddesigners.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Proddesigners
 */

public class ProddesignersHome {

    private static final Log log = LogFactory.getLog(ProddesignersHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Proddesigners transientInstance) {
        log.debug("persisting Proddesigners instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Proddesigners persistentInstance) {
        log.debug("removing Proddesigners instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Proddesigners merge(Proddesigners detachedInstance) {
        log.debug("merging Proddesigners instance");
        try {
            Proddesigners result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Proddesigners findById(Integer id) {
        log.debug("getting Proddesigners instance with id: " + id);
        try {
            Proddesigners instance = entityManager
                    .find(Proddesigners.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
