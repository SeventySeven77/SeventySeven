package springTest05;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import springTest05.dao.Impl.UserDaoImpl;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-Test05.xml")
public class SpringTest05 {
    @Autowired
    private UserDaoImpl userDao;

    @Test
    public void Test01(){
        userDao.select();
    }
}
