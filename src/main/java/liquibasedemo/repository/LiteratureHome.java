package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Literature;
import liquibasedemo.data.LiteratureId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Literature.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Literature
 */

public class LiteratureHome {

    private static final Log log = LogFactory.getLog(LiteratureHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Literature transientInstance) {
        log.debug("persisting Literature instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Literature persistentInstance) {
        log.debug("removing Literature instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Literature merge(Literature detachedInstance) {
        log.debug("merging Literature instance");
        try {
            Literature result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Literature findById(LiteratureId id) {
        log.debug("getting Literature instance with id: " + id);
        try {
            Literature instance = entityManager.find(Literature.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
