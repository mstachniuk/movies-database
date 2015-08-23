package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Countries;
import liquibasedemo.data.CountriesId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Countries.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Countries
 */

public class CountriesHome {

    private static final Log log = LogFactory.getLog(CountriesHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Countries transientInstance) {
        log.debug("persisting Countries instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Countries persistentInstance) {
        log.debug("removing Countries instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Countries merge(Countries detachedInstance) {
        log.debug("merging Countries instance");
        try {
            Countries result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Countries findById(CountriesId id) {
        log.debug("getting Countries instance with id: " + id);
        try {
            Countries instance = entityManager.find(Countries.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
