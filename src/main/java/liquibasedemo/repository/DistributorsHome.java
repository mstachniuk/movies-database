package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Distributors;
import liquibasedemo.data.DistributorsId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Distributors.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Distributors
 */

public class DistributorsHome {

    private static final Log log = LogFactory.getLog(DistributorsHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Distributors transientInstance) {
        log.debug("persisting Distributors instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Distributors persistentInstance) {
        log.debug("removing Distributors instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Distributors merge(Distributors detachedInstance) {
        log.debug("merging Distributors instance");
        try {
            Distributors result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Distributors findById(DistributorsId id) {
        log.debug("getting Distributors instance with id: " + id);
        try {
            Distributors instance = entityManager.find(Distributors.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
