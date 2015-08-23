package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Editors;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Editors.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Editors
 */

public class EditorsHome {

    private static final Log log = LogFactory.getLog(EditorsHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Editors transientInstance) {
        log.debug("persisting Editors instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Editors persistentInstance) {
        log.debug("removing Editors instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Editors merge(Editors detachedInstance) {
        log.debug("merging Editors instance");
        try {
            Editors result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Editors findById(Integer id) {
        log.debug("getting Editors instance with id: " + id);
        try {
            Editors instance = entityManager.find(Editors.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
