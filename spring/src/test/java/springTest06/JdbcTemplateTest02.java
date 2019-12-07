package springTest06;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import springTest06.Pojo.User;
import springTest06.service.MoneyUser;
import springTest06.service.UserService;

import java.util.Random;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-Test06.xml")
public class JdbcTemplateTest02 {

    @Autowired
    private MoneyUser moneyUser;

    @Test
    public void Test01(){
        moneyUser.todo();
    }


    @Test
    public void test001(){

        for (int i1 = 0; i1 < 1000; i1++) {
            int i = new Random().nextInt(100)+1;
            System.out.println(i);
        }
    }
}
