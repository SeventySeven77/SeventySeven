package springTest05.dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import springTest05.dao.UserDao;

@Repository("UserDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void select() {
        int update = jdbcTemplate.update("insert into Test01 values (5,'zhaoliu','woman')");
        System.out.println(update);
    }
}
