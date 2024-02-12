import java.sql.*;
public class Auth extends scan{
    public static int passwordverfication() throws Exception {
        Connection con = dbconnection.getconnection();
        String s = "s";
        int emp_id = 0;
        while (s.equals("s")) {
            System.out.print("Enter your Employee_id :");
            emp_id = sc.nextInt();
            System.out.print("Enter your Password :");
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
        // sc.close();
        return emp_id;

    }
}
