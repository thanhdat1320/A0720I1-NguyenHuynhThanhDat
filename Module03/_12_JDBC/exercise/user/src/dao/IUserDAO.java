package dao;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    void saveUser(User user) throws SQLException;

    User getUserById(int id) throws SQLException;

    List<User> getAllUser() throws SQLException;

    boolean deleteUser(int id) throws SQLException;

    boolean updateUser(User user) throws SQLException;

    User getUserUseStore(int id) throws SQLException;

    void insertUserUseStore(User user) throws SQLException;
}
