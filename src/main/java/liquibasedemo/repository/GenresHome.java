package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Genres;
import liquibasedemo.data.GenresId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Genres.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Genres
 */

public class GenresHome {

    private static final Log log = LogFactory.getLog(GenresHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Genres transientInstance) {
        log.debug("persisting Genres instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Genres persistentInstance) {
        log.debug("removing Genres instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Genres merge(Genres detachedInstance) {
        log.debug("merging Genres instance");
        try {
            Genres result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Genres findById(GenresId id) {
        log.debug("getting Genres instance with id: " + id);
        try {
            Genres instance = entityManager.find(Genres.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
