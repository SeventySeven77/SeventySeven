package springReviewTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import springReview.service.MoneyService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-springReview.xml")
public class Test01 {
    @Autowired
    private MoneyService moneyService;

    @Test
    public void test01(){
        moneyService.go();
    }
}
