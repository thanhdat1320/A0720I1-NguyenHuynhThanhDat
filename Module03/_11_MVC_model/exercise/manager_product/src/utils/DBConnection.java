package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static String jdbcURL = "jdbc:mysql://localhost:3306/product?useSSL=false&allowPublicKeyRetrieval=true";
    private static String jdbcUsername = "dat123";
    private static String jdbcPassword = "123123";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException ex) {
         ex.printStackTrace();
        }
        return connection;
    }
}
