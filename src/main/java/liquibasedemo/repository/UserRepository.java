package liquibasedemo.repository;

import liquibasedemo.data.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserRepository {

    private static final Log log = LogFactory.getLog(UserRepository.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(User transientInstance) {
        log.debug("persisting User instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public User findByUserNameAndEncryptedPassword(String userName, String encryptedPassword) {
        Query query = entityManager.createQuery("from User where email = :email and password = :password");
        query.setParameter("email", userName);
        query.setParameter("password", encryptedPassword);
        return (User) query.getSingleResult();
    }

    public List<User> findAll() {
        Query query = entityManager.createQuery("from User");
        return query.getResultList();
    }

    public void deleteAll() {
        List<User> all = findAll();
        all.stream().forEach(u -> entityManager.remove(u));
    }
}
