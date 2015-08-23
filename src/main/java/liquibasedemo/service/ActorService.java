package liquibasedemo.service;

import liquibasedemo.data.Actor;
import liquibasedemo.repository.ActorsHome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ActorService {

    @Autowired
    private ActorsHome actorsHome;

    @Transactional
    public void save(Actor actor) {
        actorsHome.persist(actor);
    }
}
