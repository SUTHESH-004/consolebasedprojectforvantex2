package Sutheshpackage.DBA;
import java.sql.*;

// import Sutheshpackage.DBA.dbconnection;
import Sutheshpackage.views.scan;

// import com.mysql.cj.xdevapi.Statement;

public class Employee_infoDBA extends scan {
   
    public static ArrayList< employeedetails() throws SQLException {
        Connection con = dbconnection.getconnection();
        String query = "select * from employeeinfo ";
        // Statement s = con.createStatement();
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(query);
        // rs.next();
        System.out.println(
                "╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.printf("║ %-15s ║ %-12s ║ %-15s ║ %-15s ║ %-15s ║ %-15s ║%n",
                "Name", "Date", "City", "State", "Country", "MoblieNumber");
        System.out.println(
                "╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        while (rs.next()) {
            // System.out.println(rs.getString(1));
            // System.out.print(" ");
            System.out.printf("║ %-15s ║ %-12s ║ %-15s ║ %-15s ║ %-15s ║ %-15s ║%n",
                    rs.getString(2), rs.getDate(3), rs.getString(4),
                    rs.getString(5), rs.getString(6), rs.getString(7));
           
        }
        System.out.println("Do you want to Continue");
        // Thread.sleep(20000);

    }

    public static void displayreport() {
        System.out.print("1. Display Employee Details");
    }

}
