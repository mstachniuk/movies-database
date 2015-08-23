package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Soundmix;
import liquibasedemo.data.SoundmixId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Soundmix.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Soundmix
 */

public class SoundmixHome {

    private static final Log log = LogFactory.getLog(SoundmixHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Soundmix transientInstance) {
        log.debug("persisting Soundmix instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Soundmix persistentInstance) {
        log.debug("removing Soundmix instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Soundmix merge(Soundmix detachedInstance) {
        log.debug("merging Soundmix instance");
        try {
            Soundmix result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Soundmix findById(SoundmixId id) {
        log.debug("getting Soundmix instance with id: " + id);
        try {
            Soundmix instance = entityManager.find(Soundmix.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
