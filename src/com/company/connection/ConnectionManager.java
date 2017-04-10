package com.company.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Viachaslau.
 */
public class ConnectionManager {
    private static final String URL = "jdbc:mysql://localhost:3306/bug_tracker";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "HelloWorld123";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
