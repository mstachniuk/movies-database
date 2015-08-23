package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Runningtimes;
import liquibasedemo.data.RunningtimesId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Runningtimes.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Runningtimes
 */

public class RunningtimesHome {

    private static final Log log = LogFactory.getLog(RunningtimesHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Runningtimes transientInstance) {
        log.debug("persisting Runningtimes instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Runningtimes persistentInstance) {
        log.debug("removing Runningtimes instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Runningtimes merge(Runningtimes detachedInstance) {
        log.debug("merging Runningtimes instance");
        try {
            Runningtimes result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Runningtimes findById(RunningtimesId id) {
        log.debug("getting Runningtimes instance with id: " + id);
        try {
            Runningtimes instance = entityManager.find(Runningtimes.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
