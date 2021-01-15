package service.impl;

import dao.IUserDAO;
import dao.impl.UserDAOIpml;
import model.User;
import service.IUserService;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements IUserService {
    public static IUserDAO userDAO = new UserDAOIpml();

    @Override
    public void saveUser(User user) {
//        try {
//            userDAO.saveUser(user);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        try {
            userDAO.insertUserUseStore(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> getAllUser() {
        try {
            return userDAO.getAllUser();
        } catch (SQLException e) {
            return null;
        }
    }

    @Override
    public User getUserById(int id) {
        // 1)
//        try {
//            return userDAO.getUserById(id);
//        } catch (SQLException e) {
//            return null;
//        }
        // 1)
        // 2)
        try {
            return userDAO.getUserUseStore(id);
        } catch (SQLException e) {
            return null;
        }
        // 2)
    }

    @Override
    public void updateUser(int id, User user) {
        try {
            userDAO.updateUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteUser(int id) {
        try {
            userDAO.deleteUser(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> getUserByName(String name) {
        return this.getAllUser()
                .stream()
                .filter(user -> user.getName().contains(name))
                .collect(Collectors.toList());
    }
}
