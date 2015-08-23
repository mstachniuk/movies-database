package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Prodcompanies;
import liquibasedemo.data.ProdcompaniesId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Prodcompanies.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Prodcompanies
 */

public class ProdcompaniesHome {

    private static final Log log = LogFactory.getLog(ProdcompaniesHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Prodcompanies transientInstance) {
        log.debug("persisting Prodcompanies instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Prodcompanies persistentInstance) {
        log.debug("removing Prodcompanies instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Prodcompanies merge(Prodcompanies detachedInstance) {
        log.debug("merging Prodcompanies instance");
        try {
            Prodcompanies result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Prodcompanies findById(ProdcompaniesId id) {
        log.debug("getting Prodcompanies instance with id: " + id);
        try {
            Prodcompanies instance = entityManager
                    .find(Prodcompanies.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
