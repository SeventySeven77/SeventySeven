package springTest02.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import springTest02.Dao.UserDao;
import springTest02.Service.UserService;
import springTest02.pojo.User;

import java.sql.SQLException;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    public UserDao userDao;
    @Override
    public User getUser() throws SQLException {
        return userDao.getUser();
    }
}
