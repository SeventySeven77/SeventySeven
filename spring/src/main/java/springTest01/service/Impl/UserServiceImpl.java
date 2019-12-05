package springTest01.service.Impl;

import springTest01.pojo.User;
import springTest01.service.UserService;
import springTest01.Dao.UserDao;

import java.sql.SQLException;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User getUser() throws SQLException {
        User user = userDao.getUser();
        return user;
    }
}
