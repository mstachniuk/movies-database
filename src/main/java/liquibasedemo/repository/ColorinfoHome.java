package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Colorinfo;
import liquibasedemo.data.ColorinfoId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Colorinfo.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Colorinfo
 */

public class ColorinfoHome {

    private static final Log log = LogFactory.getLog(ColorinfoHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Colorinfo transientInstance) {
        log.debug("persisting Colorinfo instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Colorinfo persistentInstance) {
        log.debug("removing Colorinfo instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Colorinfo merge(Colorinfo detachedInstance) {
        log.debug("merging Colorinfo instance");
        try {
            Colorinfo result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Colorinfo findById(ColorinfoId id) {
        log.debug("getting Colorinfo instance with id: " + id);
        try {
            Colorinfo instance = entityManager.find(Colorinfo.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
