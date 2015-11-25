package liquibasedemo.repository;

import liquibasedemo.data.UserRight;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserRightRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(UserRight transientInstance) {
        entityManager.persist(transientInstance);
    }

    public List<UserRight> findAll() {
        Query query = entityManager.createQuery("from UserRight");
        return query.getResultList();
    }


}
