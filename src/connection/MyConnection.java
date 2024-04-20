package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import connection.MyConnection;
import java.sql.Statement;

public class MyConnection {
    public static final String username = "root";
    public static final String password = "Tolaco@#!123";

    public static final String url = "jdbc:mysql://localhost:3306/online_shopping?serverTimezone=UTC";

    public static Connection con = null;

    public static Connection getConnection() {
        if (con == null) {
            try {
              
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Database driver not found: " + ex.getMessage(), "Driver Error", JOptionPane.ERROR_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Failed to connect to the database: " + ex.getMessage(), "Database Connection Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return con;
    }
}
