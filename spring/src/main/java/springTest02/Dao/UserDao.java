package springTest02.Dao;

import springTest02.pojo.User;

import java.sql.SQLException;

public interface UserDao {
    public User getUser() throws SQLException;
}
