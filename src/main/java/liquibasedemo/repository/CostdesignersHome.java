package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Costdesigners;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Costdesigners.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Costdesigners
 */

public class CostdesignersHome {

    private static final Log log = LogFactory.getLog(CostdesignersHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Costdesigners transientInstance) {
        log.debug("persisting Costdesigners instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Costdesigners persistentInstance) {
        log.debug("removing Costdesigners instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Costdesigners merge(Costdesigners detachedInstance) {
        log.debug("merging Costdesigners instance");
        try {
            Costdesigners result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Costdesigners findById(Integer id) {
        log.debug("getting Costdesigners instance with id: " + id);
        try {
            Costdesigners instance = entityManager
                    .find(Costdesigners.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
