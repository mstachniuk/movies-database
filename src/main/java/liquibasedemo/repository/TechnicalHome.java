package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Technical;
import liquibasedemo.data.TechnicalId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Technical.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Technical
 */

public class TechnicalHome {

    private static final Log log = LogFactory.getLog(TechnicalHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Technical transientInstance) {
        log.debug("persisting Technical instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Technical persistentInstance) {
        log.debug("removing Technical instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Technical merge(Technical detachedInstance) {
        log.debug("merging Technical instance");
        try {
            Technical result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Technical findById(TechnicalId id) {
        log.debug("getting Technical instance with id: " + id);
        try {
            Technical instance = entityManager.find(Technical.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
