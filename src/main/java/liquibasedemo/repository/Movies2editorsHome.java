package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1

import liquibasedemo.data.Movies2editors;
import liquibasedemo.data.Movies2editorsId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Movies2editors.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Movies2editors
 */
public class Movies2editorsHome {

    private static final Log log = LogFactory.getLog(Movies2editorsHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Movies2editors transientInstance) {
        log.debug("persisting Movies2editors instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Movies2editors persistentInstance) {
        log.debug("removing Movies2editors instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Movies2editors merge(Movies2editors detachedInstance) {
        log.debug("merging Movies2editors instance");
        try {
            Movies2editors result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Movies2editors findById(Movies2editorsId id) {
        log.debug("getting Movies2editors instance with id: " + id);
        try {
            Movies2editors instance = entityManager.find(Movies2editors.class,
                    id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
