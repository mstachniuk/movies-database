package liquibasedemo.repository;

// Generated Dec 15, 2014 12:52:59 AM by Hibernate Tools 4.3.1


import liquibasedemo.data.Movie;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Home object for domain model class Movie.
 *
 * @author Hibernate Tools
 * @see liquibasedemo.data.Movie
 */
@Repository
public class MovieHome {

    private static final Log log = LogFactory.getLog(MovieHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(Movie transientInstance) {
        log.debug("persisting Movie instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Movie persistentInstance) {
        log.debug("removing Movie instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Movie merge(Movie detachedInstance) {
        log.debug("merging Movie instance");
        try {
            Movie result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Movie findById(Integer id) {
        log.debug("getting Movie instance with id: " + id);
        try {
            Movie instance = entityManager.find(Movie.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }

    public List<Movie> findByTitle(String title) {
        Query query = entityManager.createQuery("from Movie where title = :title");
        query.setParameter("title", title);
        return query.getResultList();
    }

    public List<Movie> findAll() {
        Query query = entityManager.createQuery("from Movie");
        query.setMaxResults(20);
        return query.getResultList();
    }
}
