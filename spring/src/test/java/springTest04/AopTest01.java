package springTest04;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import springTest04.dao.AopTestInterface;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-aopAnnotation.xml")
public class AopTest01 {
    @Autowired
    private AopTestInterface aopTestInterface;

    @Test
    public void test01(){
        aopTestInterface.aop();
    }
}
