package liquibasedemo.service;

import liquibasedemo.data.User;
import liquibasedemo.data.UserRight;
import liquibasedemo.repository.UserRepository;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserService {

    private Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void createStandardUser(CreateUserInput input, List<UserRight> allRights) {
        User user = createUserWith(standardRights(allRights), input);
        userRepository.persist(user);
    }

    @Transactional
    public void createAdminUser(CreateUserInput input, List<UserRight> allRights) {
        User user = createUserWith(adminRights(allRights), input);
        userRepository.persist(user);
    }

    @Transactional
    public void createPowerUser(CreateUserInput input, List<UserRight> allRights) {
        User user = createUserWith(powerRights(allRights), input);
        userRepository.persist(user);
    }

    private User createUserWith(List<UserRight> userRights, CreateUserInput input) {
        User user = new User();
        user.setEmail(input.getEmail());
        user.setPassword(encrypt(input.getPassword()));
        user.setUserRights(userRights);
        return user;
    }

    private List<UserRight> standardRights(List<UserRight> allRights) {
        return allRights.stream()
                .filter(ur -> ur.getRoleName().equals("user"))
                .collect(Collectors.toList());
    }


    private List<UserRight> adminRights(List<UserRight> allRights) {
        return allRights.stream()
                .filter(ur -> ur.getRoleName().equals("user") || ur.getRoleName().equals("admin"))
                .collect(Collectors.toList());
    }

    private List<UserRight> powerRights(List<UserRight> allRights) {
        List<String> powerRightNames = Stream.of("user", "changeConfiguration", "orderAcceptor")
                .collect(Collectors.toList());
        return allRights.stream()
                .filter(ur -> powerRightNames.contains(ur.getRoleName()))
                .collect(Collectors.toList());
    }

    private String encrypt(String input) {
        // You should also salt it!
        return DigestUtils.sha256Hex(input);
    }

    public User login(String userName, String password) {
        return userRepository.findByUserNameAndEncryptedPassword(userName, encrypt(password));
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Transactional
    public void deleteAll() {
        userRepository.deleteAll();
    }

    @Transactional
    public void createSomeUsers() {
        log.info("createSomeUsers");
        for (int i = 0; i < 100; i++) {
            List<UserRight> allRights = createAllPossiblesRights();
            CreateUserInput userInput = new CreateUserInput("jon" + i + "@doe.com", "$upa" + i);
            switch (i % 3) {
                case 0:
                    createStandardUser(userInput, allRights);
                    break;

                case 1:
                    createAdminUser(userInput, allRights);
                    break;

                case 2:
                    createPowerUser(userInput, allRights);
                    break;
            }
        }
    }

    private List<UserRight> createAllPossiblesRights() {
        List<UserRight> expectedRights = new ArrayList<>();
        expectedRights.add(new UserRight("user", "standard user"));
        expectedRights.add(new UserRight("changeConfiguration", "can change config"));
        expectedRights.add(new UserRight("orderAcceptor", "can accept order"));
        expectedRights.add(new UserRight("admin", "Admin Super User"));
        return expectedRights;
    }

}
