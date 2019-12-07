package springTest06.service;

import springTest06.Pojo.User;

import java.util.List;

public interface UserService {
    public void userDelete(int i);
    public void userAdd(User user);
    public void userUpdate(User user);
    public List<User> userQuery(int i);
    public User userQueryOne(int i);
}
