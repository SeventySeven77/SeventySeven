package springTest03;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import springTest03.dao.TargetInterface;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class test01 {
    @Autowired
    private TargetInterface targetInterface;

    @Test
    public void test01(){
        targetInterface.save();
    }
}
