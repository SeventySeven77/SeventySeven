package springTest01.userDao;

import springTest01.pojo.User;

import java.sql.SQLException;

public interface UserDao {
    public User getUser() throws SQLException;
}
