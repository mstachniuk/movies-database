package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Altversions;
import liquibasedemo.data.AltversionsId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Altversions.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Altversions
 */

public class AltversionsHome {

    private static final Log log = LogFactory.getLog(AltversionsHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Altversions transientInstance) {
        log.debug("persisting Altversions instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Altversions persistentInstance) {
        log.debug("removing Altversions instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Altversions merge(Altversions detachedInstance) {
        log.debug("merging Altversions instance");
        try {
            Altversions result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Altversions findById(AltversionsId id) {
        log.debug("getting Altversions instance with id: " + id);
        try {
            Altversions instance = entityManager.find(Altversions.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
