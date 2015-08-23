package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Keywords;
import liquibasedemo.data.KeywordsId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Keywords.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Keywords
 */

public class KeywordsHome {

    private static final Log log = LogFactory.getLog(KeywordsHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Keywords transientInstance) {
        log.debug("persisting Keywords instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Keywords persistentInstance) {
        log.debug("removing Keywords instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Keywords merge(Keywords detachedInstance) {
        log.debug("merging Keywords instance");
        try {
            Keywords result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Keywords findById(KeywordsId id) {
        log.debug("getting Keywords instance with id: " + id);
        try {
            Keywords instance = entityManager.find(Keywords.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
