package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Biographies;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Biographies.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Biographies
 */

public class BiographiesHome {

    private static final Log log = LogFactory.getLog(BiographiesHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Biographies transientInstance) {
        log.debug("persisting Biographies instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Biographies persistentInstance) {
        log.debug("removing Biographies instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Biographies merge(Biographies detachedInstance) {
        log.debug("merging Biographies instance");
        try {
            Biographies result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Biographies findById(Integer id) {
        log.debug("getting Biographies instance with id: " + id);
        try {
            Biographies instance = entityManager.find(Biographies.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
