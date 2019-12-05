package springTest02.Service;

import springTest02.pojo.User;

import java.sql.SQLException;

public interface UserService {
    public User getUser() throws SQLException;
}
