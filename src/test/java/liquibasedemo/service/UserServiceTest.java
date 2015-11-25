package liquibasedemo.service;

import liquibasedemo.Application;
import liquibasedemo.data.User;
import liquibasedemo.data.UserRight;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@ActiveProfiles("test")
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void shouldCreateStandardUser() {
        // given
        CreateUserInput input = new CreateUserInput("jon@doe.com", "123");
        UserRight standardRight = new UserRight("user", "standard user");

        // when
        userService.createStandardUser(input, Arrays.asList(standardRight));
        User actual = userService.login("jon@doe.com", "123");

        // then
        assertThat(actual.getEmail())
                .isEqualTo("jon@doe.com");
        assertThat(actual.getUserRights())
                .containsOnly(new UserRight("user", "standard user"));
    }

}