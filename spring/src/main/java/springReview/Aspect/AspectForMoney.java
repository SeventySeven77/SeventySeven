package springReview.Aspect;

import springReview.dao.MoneyDao;

public class AspectForMoney {

    private MoneyDao moneyDao;

    public void setMoneyDao(MoneyDao moneyDao) {
        this.moneyDao = moneyDao;
    }

    public void before(){
        System.out.println("------------------------------------------------------------------------");
        System.out.println(moneyDao.getMoneyForUser(1));
        System.out.println(moneyDao.getMoneyForUser(2));
        System.out.println("------------------------------------------------------------------------");
    }

    public void end(){
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(moneyDao.getMoneyForUser(1));
        System.out.println(moneyDao.getMoneyForUser(2));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
