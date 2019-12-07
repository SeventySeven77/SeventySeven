package springTest06.dao.Impl;

import com.sun.xml.internal.fastinfoset.util.ValueArrayResourceException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import springTest06.Pojo.User;
import springTest06.dao.UserDao;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /*
    * 删除指定ID
    * */
    @Override
    public void userDelete(int i) {
        jdbcTemplate.update("delete from Test01 where id = ?",i);
    }
    /*
    * 添加user
    * */
    @Override
    public void userAdd(User user) {
        jdbcTemplate.update("insert into Test01 values( ?, ?, ?)",user.getId(),user.getName(),user.getAge());
    }

    /*
    * 修改user
    * */
    @Override
    public void userUpdate(User user) {
        jdbcTemplate.update("update Test01 set name = ?,age = ? where id = ?",user.getName(),user.getAge(),user.getId());
    }


    @Override
    public List<User> userQuery(int i) {
        List<User> query = jdbcTemplate.query("select * from Test01", new BeanPropertyRowMapper<User>(User.class));

        return query;
    }

    @Override
    public User userQueryOne(int i) {
        User user = jdbcTemplate.queryForObject("select * from Test01 where id = ?", new BeanPropertyRowMapper<User>(User.class), i);
        return user;
    }
}
