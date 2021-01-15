package dao.impl;

import dao.IUserDAO;
import model.User;
import utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOIpml implements IUserDAO {
    public static Connection connection = DBConnection.getConnection();
    public static final String INSERT_USER = "insert into users(id, name, email, country) value(?, ?, ?, ?)";
    public static final String GET_USER_BY_ID = "select * from users where id = ?";
    public static final String GET_ALL_USER = "select * from users";
    public static final String DELETE_USER = "delete from users where id = ?";
    public static final String UPDATE_USER = "update users set name = ?, email = ?, country = ? where id = ?";


    @Override
    public void saveUser(User user) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER);
        preparedStatement.setInt(1, user.getId());
        preparedStatement.setString(2, user.getName());
        preparedStatement.setString(3, user.getEmail());
        preparedStatement.setString(4, user.getCountry());

        preparedStatement.executeUpdate();
    }

    @Override
    public User getUserById(int id) throws SQLException {
        User user = null;
        PreparedStatement preparedStatement = connection.prepareStatement(GET_USER_BY_ID);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            String country = resultSet.getString("country");

            user = new User(id, name, email, country);
        }
        return user;
    }

    @Override
    public List<User> getAllUser() throws SQLException {
        List<User> userList = new ArrayList();

        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_USER);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            String country = resultSet.getString("country");
            userList.add(new User(id, name, email, country));
        }
        return userList;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER);
        preparedStatement.setInt(1, id);

        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER);
        preparedStatement.setInt(4,  user.getId());
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getEmail());
        preparedStatement.setString(3, user.getCountry());
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public User getUserUseStore(int id) throws SQLException {
        User user = null;
        String query = "{call get_user_by_id(?)}";
        CallableStatement callableStatement = connection.prepareCall(query);
        callableStatement.setInt(1, id);

        ResultSet resultSet = callableStatement.executeQuery();
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            String country = resultSet.getString("country");
            user = new User(id, name, email, country);
        }
        return user;
    }

    @Override
    public void insertUserUseStore(User user) throws SQLException {
        String query = "{call insertUserStore(?, ?, ?)}";
        CallableStatement callableStatement = connection.prepareCall(query);
        callableStatement.setString(1, user.getName());
        callableStatement.setString(2, user.getEmail());
        callableStatement.setString(3, user.getCountry());

        callableStatement.executeUpdate();
    }
}
