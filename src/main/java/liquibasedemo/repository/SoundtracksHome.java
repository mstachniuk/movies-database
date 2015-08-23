package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Soundtracks;
import liquibasedemo.data.SoundtracksId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Soundtracks.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Soundtracks
 */

public class SoundtracksHome {

    private static final Log log = LogFactory.getLog(SoundtracksHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Soundtracks transientInstance) {
        log.debug("persisting Soundtracks instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Soundtracks persistentInstance) {
        log.debug("removing Soundtracks instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Soundtracks merge(Soundtracks detachedInstance) {
        log.debug("merging Soundtracks instance");
        try {
            Soundtracks result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Soundtracks findById(SoundtracksId id) {
        log.debug("getting Soundtracks instance with id: " + id);
        try {
            Soundtracks instance = entityManager.find(Soundtracks.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
