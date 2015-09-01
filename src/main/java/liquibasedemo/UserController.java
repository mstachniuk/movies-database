package liquibasedemo;

import liquibasedemo.data.User;
import liquibasedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public void createExampleUsers() {
        userService.createSomeUsers();
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public void deleteAllUsers() {
        userService.deleteAll();
    }
}
