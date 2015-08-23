package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Language;
import liquibasedemo.data.LanguageId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Language.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Language
 */

public class LanguageHome {

    private static final Log log = LogFactory.getLog(LanguageHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Language transientInstance) {
        log.debug("persisting Language instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Language persistentInstance) {
        log.debug("removing Language instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Language merge(Language detachedInstance) {
        log.debug("merging Language instance");
        try {
            Language result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Language findById(LanguageId id) {
        log.debug("getting Language instance with id: " + id);
        try {
            Language instance = entityManager.find(Language.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
