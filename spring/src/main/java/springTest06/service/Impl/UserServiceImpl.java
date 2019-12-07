package springTest06.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import springTest06.Pojo.User;
import springTest06.dao.UserDao;
import springTest06.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void userDelete(int i) {
        userDao.userDelete(i);
    }

    @Override
    public void userAdd(User user) {
        userDao.userAdd(user);
    }

    @Override
    public void userUpdate(User user) {
        userDao.userUpdate(user);
    }

    @Override
    public List<User> userQuery(int i) {
        return userDao.userQuery(i);
    }

    @Override
    public User userQueryOne(int i) {
        return userDao.userQueryOne(i);
    }
}
