package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Mpaaratings;
import liquibasedemo.data.MpaaratingsId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Mpaaratings.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Mpaaratings
 */

public class MpaaratingsHome {

    private static final Log log = LogFactory.getLog(MpaaratingsHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Mpaaratings transientInstance) {
        log.debug("persisting Mpaaratings instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Mpaaratings persistentInstance) {
        log.debug("removing Mpaaratings instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Mpaaratings merge(Mpaaratings detachedInstance) {
        log.debug("merging Mpaaratings instance");
        try {
            Mpaaratings result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Mpaaratings findById(MpaaratingsId id) {
        log.debug("getting Mpaaratings instance with id: " + id);
        try {
            Mpaaratings instance = entityManager.find(Mpaaratings.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
