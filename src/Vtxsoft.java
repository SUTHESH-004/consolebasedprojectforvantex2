import java.time.*;
import java.util.*;
import java.sql.*;

public class Vtxsoft {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        Connection con = dbconnection.getconnection();
        System.out.println("Enter your password");
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        // System.out.printf("%80s", " ");
        System.out.println("THE CURRENT DATE IS =" + date);
        System.out.println("THE CURRENT TIME IS =" + time);
        String display = "select * from employeeinfo;";

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(display);
        while(rs.next())
        { 
        System.out.print(rs.getInt(1)+" ");
        System.out.print(rs.getString(2));
        System.out.println();
    }
        

        //         System.out.printf("%55s", " ");
        //         System.out.println(" ______________________________________________");
        //         System.out.printf("%55s", " ");

        //         System.out.println("|                                              |");
        //         System.out.printf("%55s", " ");

        //         System.out.println("|        WELCOME TO VANTEX SOFT - EMPLOYEE     |");
        //         System.out.printf("%55s", " ");

        //         System.out.println("|                 DATA  BASE                   |");
        //         System.out.printf("%55s", " ");

        //         System.out.println("|______________________________________________|");
        // System.out.println("ENTRY : 1 |  REPORT : 2 | ADDITION : 3 | WAGES : 4");
        // String value = "";
        // String query = "insert into employeeinfo values(1,'SutheshPravin','2003-1-12','Kunnathur','Tamil Nadu','India',NULL,'2024-1-10',NULL,NULL);";
        // while (!value.equals("0")) {
        //     value = sc.next();
        //     String AOE = "";
        //     if (value.equals("1")) {
        //         System.out.println("ATTENDANCE : 1 | OUTPUT ENTRY : 2 ");
        //         AOE = sc.next();
        //         if (AOE.equals("1")) {
        //             System.out.println(" ENTER THE EMPLOYEE ID");
        //             String an = sc.nextLine();

        //             PreparedStatement dummy = con.prepareStatement(query);
        //             dummy.executeUpdate();
        //             // 1System.out.println(rs);
        //         }
        //     }
        // }
        sc.close();
    }
}
