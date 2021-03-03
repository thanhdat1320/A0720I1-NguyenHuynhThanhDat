package repository.impl;

import model.Login;
import model.User;
import org.springframework.stereotype.Repository;
import repository.IUserRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements IUserRepository {
    private static List<User> userList;
    static {
        userList = new ArrayList<>();
        User user = new User();
        user.setAge(10);
        user.setName("Dat");
        user.setAccount("dat");
        user.setEmail("john@codegym.vn");
        user.setPassword("123456");
        userList.add(user);

        User user2 = new User();
        user2.setAge(15);
        user2.setName("Bill");
        user2.setAccount("bill");
        user2.setEmail("bill@codegym.vn");
        user2.setPassword("123456");
        userList.add(user2);

        User user3 = new User();
        user3.setAge(16);
        user3.setName("Mike");
        user3.setAccount("mike");
        user3.setEmail("mike@codegym.vn");
        user3.setPassword("123456");
        userList.add(user3);
    }

    @Override
    public User checkLogin(Login login) {
        for (User user : userList) {
            if (user.getAccount().equals(login.getUsername()) && user.getPassword().equals(login.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
