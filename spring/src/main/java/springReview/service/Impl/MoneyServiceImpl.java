package springReview.service.Impl;

import springReview.dao.MoneyDao;
import springReview.pojo.MoneyForUser;
import springReview.service.MoneyService;

import java.util.Random;

public class MoneyServiceImpl implements MoneyService {

    private MoneyDao moneyDao;

    public void setMoneyDao(MoneyDao moneyDao) {
        this.moneyDao = moneyDao;
    }

    @Override
    public void go() {

        for (int i = 0; i <100 ; i++) {
            MoneyForUser tom = moneyDao.getMoneyForUser(1);
            MoneyForUser lucy = moneyDao.getMoneyForUser(2);
            System.out.println("tom = "+tom.getMoney());
            System.out.println("lucy = "+lucy.getMoney());
            int num = getNum();
            if (i%2==0){num = -num;}
            //if (judge(tom.getMoney(),num)&&judge(lucy.getMoney(),num)){
                moneyDao.setMoneyForUser(tom,num);
            //if (i==80){ int k = 1/0;}
                moneyDao.setMoneyForUser(lucy,-num);
          //  }
        }
    }



    public Boolean judge(int a, int b) {
        if ((a - b) >= 0) return true;
        else return false;
    }

    public int getNum() {
        return new Random().nextInt(100)+1;


    }


}
