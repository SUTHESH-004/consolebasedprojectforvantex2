package x;
import java.sql.*;

import Sutheshpackage.DBA.Dbconnection;

public class Something {
    public static void main(String[] args) throws Exception {
        Connection con = Dbconnection.getconnection();
        String query = "select * from employeeinfo";
        //  lsknjdksn st = con.createStatement();
        PreparedStatement pst = con.prepareStatement(query);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            // System.out.println(rs.getString(0));
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
            System.out.println(rs.getString(4));
        }
    }
}
