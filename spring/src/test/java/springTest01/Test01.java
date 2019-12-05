package springTest01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import springTest01.service.UserService;

import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test01 {
    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @Test
    public void test01() throws SQLException {
        System.out.println(userService.getUser());
    }
}
