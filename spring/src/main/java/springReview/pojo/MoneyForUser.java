package springReview.pojo;

import org.springframework.stereotype.Component;

/*
* 定义user类 跟MYSQL内数据绑定
* */

public class MoneyForUser {
    private int id;
    private String name;
    private int money;

    @Override
    public String toString() {
        return "MoneyForUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
