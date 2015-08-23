package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Certificates;
import liquibasedemo.data.CertificatesId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Home object for domain model class Certificates.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Certificates
 */

public class CertificatesHome {

    private static final Log log = LogFactory.getLog(CertificatesHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Certificates transientInstance) {
        log.debug("persisting Certificates instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Certificates persistentInstance) {
        log.debug("removing Certificates instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Certificates merge(Certificates detachedInstance) {
        log.debug("merging Certificates instance");
        try {
            Certificates result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Certificates findById(CertificatesId id) {
        log.debug("getting Certificates instance with id: " + id);
        try {
            Certificates instance = entityManager.find(Certificates.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
