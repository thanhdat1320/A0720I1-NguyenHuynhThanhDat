package service;

import model.User;

import java.util.List;

public interface IUserService {
    void saveUser(User user);

    List<User> getAllUser();

    User getUserById(int id);

    void updateUser(int id, User user);

    void deleteUser(int id);

    List<User> getUserByName(String name);
}
