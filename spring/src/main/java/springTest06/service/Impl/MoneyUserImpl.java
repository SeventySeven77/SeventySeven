package springTest06.service.Impl;


import springTest06.Pojo.User;
import springTest06.service.MoneyUser;
import springTest06.service.UserService;

public class MoneyUserImpl implements MoneyUser {
    private UserService userService;
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void todo() {
        user.setId(5000);
        user.setName("t1");
        user.setAge("woman");
        userService.userUpdate(user);
 //       int i = 1 / 0;
        user.setId(4000);
        user.setName("t2");
        user.setAge("woman");
        userService.userUpdate(user);
    }
}
