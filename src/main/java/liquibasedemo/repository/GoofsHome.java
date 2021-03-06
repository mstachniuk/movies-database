package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Goofs;
import liquibasedemo.data.GoofsId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Goofs.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Goofs
 */

public class GoofsHome {

    private static final Log log = LogFactory.getLog(GoofsHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Goofs transientInstance) {
        log.debug("persisting Goofs instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Goofs persistentInstance) {
        log.debug("removing Goofs instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Goofs merge(Goofs detachedInstance) {
        log.debug("merging Goofs instance");
        try {
            Goofs result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Goofs findById(GoofsId id) {
        log.debug("getting Goofs instance with id: " + id);
        try {
            Goofs instance = entityManager.find(Goofs.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
