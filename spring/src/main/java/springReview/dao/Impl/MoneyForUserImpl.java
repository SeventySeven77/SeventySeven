package springReview.dao.Impl;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import springReview.dao.MoneyDao;
import springReview.pojo.MoneyForUser;

public class MoneyForUserImpl implements MoneyDao {
    private JdbcTemplate jdbcTemplate;//spring注入Template
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public MoneyForUser getMoneyForUser(int i) {
        MoneyForUser moneyForUser = jdbcTemplate.queryForObject("select * from springReview where id = ?", new BeanPropertyRowMapper<MoneyForUser>(MoneyForUser.class), i);
        //System.out.println(moneyForUser);
        return moneyForUser;
    }

    @Override
    public void setMoneyForUser(MoneyForUser moneyForUser,int i) {
        jdbcTemplate.update("update springReview set money = ? where id = ?",moneyForUser.getMoney()+(i),moneyForUser.getId());
    }
}
