package springTest01.service;

import springTest01.pojo.User;

import java.sql.SQLException;

public interface UserService {
    public User getUser() throws SQLException;
}
