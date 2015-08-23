package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Plots;
import liquibasedemo.data.PlotsId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Plots.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Plots
 */

public class PlotsHome {

    private static final Log log = LogFactory.getLog(PlotsHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Plots transientInstance) {
        log.debug("persisting Plots instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Plots persistentInstance) {
        log.debug("removing Plots instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Plots merge(Plots detachedInstance) {
        log.debug("merging Plots instance");
        try {
            Plots result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Plots findById(PlotsId id) {
        log.debug("getting Plots instance with id: " + id);
        try {
            Plots instance = entityManager.find(Plots.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
