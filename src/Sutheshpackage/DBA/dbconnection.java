package Sutheshpackage.DBA;
import java.sql.*;
public class dbconnection {
    private static String url = "jdbc:mysql://localhost:3306/vantexemployee";
    private static String username = "root";
    private static String pass = "Suthesh123s";
    public static Connection getconnection() throws SQLException{
        Connection con = DriverManager.getConnection(url,username,pass);
        return con;
    }
}
