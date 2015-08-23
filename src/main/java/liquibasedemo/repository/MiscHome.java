package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Misc;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Misc.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Misc
 */

public class MiscHome {

    private static final Log log = LogFactory.getLog(MiscHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Misc transientInstance) {
        log.debug("persisting Misc instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Misc persistentInstance) {
        log.debug("removing Misc instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Misc merge(Misc detachedInstance) {
        log.debug("merging Misc instance");
        try {
            Misc result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Misc findById(Integer id) {
        log.debug("getting Misc instance with id: " + id);
        try {
            Misc instance = entityManager.find(Misc.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
