import java.sql.*;

// import com.mysql.cj.xdevapi.Statement;

public class Employee_info extends scan {

    public static void Empenter() throws SQLException {

        displayreport();
        int choice = 0;
        try {
            choice = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Enter a valid number");
            Empenter();
        }
        switch (choice) {
            case 1 -> employeedetails();
        }

    }

    public static void employeedetails() throws SQLException {
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
            // System.out.println(rs.getString(2));
            // System.out.print(" ");
            // System.out.print(rs.getDate(3));
            // System.out.print(" ");
            // System.out.print(rs.getString(4));
            // System.out.print(rs.getString(5));
            // System.out.print(" ");
            // System.out.print(rs.getString(6));
            // System.out.print(" ");
            // System.out.print(rs.getString(7));
            // System.out.println();
        }
        System.out.println("Do you want to Continue");
        // Thread.sleep(20000);

    }

    public static void displayreport() {
        System.out.print("1. Display Employee Details");
    }

}
