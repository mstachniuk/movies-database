package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Crazycredits;
import liquibasedemo.data.CrazycreditsId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Crazycredits.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Crazycredits
 */

public class CrazycreditsHome {

    private static final Log log = LogFactory.getLog(CrazycreditsHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Crazycredits transientInstance) {
        log.debug("persisting Crazycredits instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Crazycredits persistentInstance) {
        log.debug("removing Crazycredits instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Crazycredits merge(Crazycredits detachedInstance) {
        log.debug("merging Crazycredits instance");
        try {
            Crazycredits result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Crazycredits findById(CrazycreditsId id) {
        log.debug("getting Crazycredits instance with id: " + id);
        try {
            Crazycredits instance = entityManager.find(Crazycredits.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
