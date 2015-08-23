package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Movielinks;
import liquibasedemo.data.MovielinksId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Movielinks.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Movielinks
 */

public class MovielinksHome {

    private static final Log log = LogFactory.getLog(MovielinksHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Movielinks transientInstance) {
        log.debug("persisting Movielinks instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Movielinks persistentInstance) {
        log.debug("removing Movielinks instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Movielinks merge(Movielinks detachedInstance) {
        log.debug("merging Movielinks instance");
        try {
            Movielinks result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Movielinks findById(MovielinksId id) {
        log.debug("getting Movielinks instance with id: " + id);
        try {
            Movielinks instance = entityManager.find(Movielinks.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
