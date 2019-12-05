package springTest02.Dao.Impl;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import springTest02.Dao.UserDao;
import springTest02.pojo.User;

import java.sql.SQLException;
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private User user;

    @Autowired
    private DruidDataSource druidDataSource;

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
