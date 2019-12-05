package springTest01.userDao.Impl;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import springTest01.pojo.User;
import springTest01.userDao.UserDao;

import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

    @Autowired
    @Qualifier("dataSource")
    private DruidDataSource druidDataSource;
    @Autowired
    @Qualifier("User")
    private User user;

    @Override
    public User getUser() throws SQLException {
        DruidPooledConnection connection = druidDataSource.getConnection();
        System.out.println("意思意思去查一下"+connection);
        user.setAge(18);
        user.setName("张三");
        user.setSex("男");
        return user;
    }
}
