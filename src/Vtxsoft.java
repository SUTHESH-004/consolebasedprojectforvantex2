import java.time.*;
import java.util.*;
import java.sql.*;

public class Vtxsoft {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Connection con = dbconnection.getconnection();
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("THE CURRENT DATE IS =" + date);
        System.out.println("THE CURRENT TIME IS =" + time);
        int emp_id = passwordverfication();
        System.out.println("Enter the number according to Value");
        System.out.print("Entry 1 | Enter the 0 to exit");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.print(" Entry 1 | Exit : 0");
            int method = sc.nextInt();
            if (method == 2) {
                String query = "select employee_name,employee_id from employeeinfo where posts_id not in(2)";
                Statement st = con.createStatement();
                ResultSet rp = st.executeQuery(query);
                // rp.next();
                System.out.println("Enter P to present | Enter A to absent ");
                while (rp.next()) {
                    String name = rp.getString(1);
                    System.out.print("Is" + name + " Present : ");
                    String state = sc.next();
                    String query1 = "insert into attendancesheet values(?,?,?,?);";
                    PreparedStatement stated = con.prepareStatement(query1);
                    stated.setInt(1, rp.getInt(2));
                    stated.setString(2, state);
                    // String date1 = date;
                    // Date date1 = date;
                    stated.setDate(3, java.sql.Date.valueOf(date));
                    stated.setInt(4, emp_id);
                    int q = stated.executeUpdate();
                    
                }

            }
        }

    }

    public static int passwordverfication() throws Exception {
        Connection con = dbconnection.getconnection();
        Scanner sc = new Scanner(System.in);
        String s = "s";
        int emp_id = 0;
        while (s.equals("s")) {
            System.out.println("Enter your Employee_id");
            emp_id = sc.nextInt();
            System.out.println("Enter your Password");
            String pass = sc.next();
            String query = "select pass from passwordlist where employee_id=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, emp_id);

            ResultSet rs = ps.executeQuery();
            rs.next();
            try {
                if (rs.getString(1).equals(pass))
                    break;
                else
                    System.out.println("Entered password is wrong");
            } catch (Exception e) {
                System.out.println("Entered name or password is incorect please Try again");
            }
        }
        sc.close();
        return emp_id;

    }
}
