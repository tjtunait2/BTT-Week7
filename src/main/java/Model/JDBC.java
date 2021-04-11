package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    private static Connection connection;

    static {
        String URL = "jdbc:mysql://localhost:3306/db_27";
        String USER_NAME = "test123";
        String USER_PASS = "test123";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER_NAME, USER_PASS);
            System.out.println("ket noi thanh cong");
        } catch (SQLException | ClassNotFoundException error) {
            error.printStackTrace();
        }
    }

    public static Connection getConnectDatabase() {
        return connection;
    }
}