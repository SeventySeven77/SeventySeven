package springTest06;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import springTest06.Pojo.User;
import springTest06.service.UserService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-Test06.xml")
public class JdbcTemplateTest01 {
    @Autowired
    private UserService userService;
    @Autowired
    private User user;
    @Test
    public void Test01(){
        //userService.userDelete(2);
//        user.setAge("woman");
//        user.setId(6);
//        user.setName("Ten");
////
////        userService.userAdd(user);
//        userService.userUpdate(user);
//        List<User> users = userService.userQuery(1);
//        for (User user1 : users) {
//            System.out.println(user1);
//        }
        System.out.println(userService.userQueryOne(4));
    }
}
