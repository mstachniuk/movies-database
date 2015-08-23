package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Quotes;
import liquibasedemo.data.QuotesId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Quotes.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Quotes
 */

public class QuotesHome {

    private static final Log log = LogFactory.getLog(QuotesHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Quotes transientInstance) {
        log.debug("persisting Quotes instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Quotes persistentInstance) {
        log.debug("removing Quotes instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Quotes merge(Quotes detachedInstance) {
        log.debug("merging Quotes instance");
        try {
            Quotes result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Quotes findById(QuotesId id) {
        log.debug("getting Quotes instance with id: " + id);
        try {
            Quotes instance = entityManager.find(Quotes.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
