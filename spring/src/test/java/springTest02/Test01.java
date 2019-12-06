package springTest02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import springTest02.Service.UserService;
import springTest02.config.springConfiguration;

import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {springConfiguration.class})
public class Test01 {

    @Autowired
    public UserService userService;

    @Test
    public void Test01() throws SQLException {
        userService.getUser();
    }
}
