package springReview.dao;

import springReview.pojo.MoneyForUser;

public interface MoneyDao {
    public MoneyForUser getMoneyForUser(int i);
    public void setMoneyForUser(MoneyForUser moneyForUser,int i);
}
