package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Trivia;
import liquibasedemo.data.TriviaId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Trivia.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Trivia
 */

public class TriviaHome {

    private static final Log log = LogFactory.getLog(TriviaHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Trivia transientInstance) {
        log.debug("persisting Trivia instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Trivia persistentInstance) {
        log.debug("removing Trivia instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Trivia merge(Trivia detachedInstance) {
        log.debug("merging Trivia instance");
        try {
            Trivia result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Trivia findById(TriviaId id) {
        log.debug("getting Trivia instance with id: " + id);
        try {
            Trivia instance = entityManager.find(Trivia.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
