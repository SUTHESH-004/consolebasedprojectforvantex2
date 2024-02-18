package x;
import java.sql.*;

import Sutheshpackage.DBA.dbconnection;

// import java.sql.*;
public class Position {
      
    public static int positionChecker(int emp_id) throws SQLException
    {
        Connection con = dbconnection.getconnection();
        String Query ="select posts_id from employeeinfo where employee_id =? ";
        PreparedStatement ps = con.prepareStatement(Query);
        ps.setInt(1,emp_id);
        ResultSet rs = ps.executeQuery();
        rs.next();
        // System.out.print(rs.getInt(1));
        return rs.getInt(1);
    }
}
