package Sutheshpackage.DBA;
import java.sql.*;
import java.util.*;

import Sutheshpackage.Modal.employee;
// import Sutheshpackage.DBA.dbconnection;
import Sutheshpackage.views.scan;
// import com.mysql.cj.xdevapi.Statement;

public class Employee_infoDBA extends scan {
   
    public static ArrayList<employee> employeedetails() throws SQLException {
        Connection con = Dbconnection.getconnection();
        String query = "select * from employeeinfo ";
        // Statement s = con.createStatement();
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(query);
        ArrayList<employee> list = new ArrayList<employee>();
        
        while (rs.next()) {
                    employee emp =  new employee();
                     emp.setname(rs.getString(2));
                     emp.setdob(" "+rs.getDate(3));
                    emp.setcity(rs.getString(4));
                    emp.setstate(rs.getString(5));
                     emp.setcountry(rs.getString(6));
                     emp.setmobilenumber(rs.getString(7));          
                     emp.setjoineddate(""+rs.getDate(8));
                     emp.setrelieveddate(""+rs.getDate(9));
                     emp.setaddress(rs.getString(10));
                    list.add(emp);
        }
        return list;

    }

    }
