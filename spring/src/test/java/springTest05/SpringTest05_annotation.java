package springTest05;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import springTest05.config.configTest05;
import springTest05.dao.UserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {configTest05.class})
public class SpringTest05_annotation {
    @Autowired
    private UserDao userDao;

    @Test
    public void Test02(){
        userDao.select();
    }
}
