package x;
import java.sql.*;
import java.time.LocalDate;

import Sutheshpackage.Controller.Supervisor;
import Sutheshpackage.DBA.dbconnection;
import Sutheshpackage.views.scan;

// import javax.lang.model.util.ElementScanner14;

public class Entry extends scan {

    public static void entryStatus(int emp_id,int position) throws SQLException{
        Connection con = dbconnection.getconnection();
        LocalDate date = LocalDate.now();
        
            if(datechecker(date))
            {
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
                stated.executeUpdate();
            }
              String y = "insert into datedata values(?,?);";
              PreparedStatement ot = con.prepareStatement(y);
              ot.setBoolean(1,true);
              ot.setDate(2,java.sql.Date.valueOf(date));
              ot.executeUpdate();

            }
            else
            {
                System.out.println("Todays Attendance is already entered by+");
                if(position==2)
                {
                    Supervisor.enter();
                }
                else if(position ==3){
                    // Manager.enter();
                }

            }

    }
         public static Boolean datechecker(LocalDate date) throws SQLException
         {
            Connection con = dbconnection.getconnection();

            String Query = "Select isDate from datedata where dates = ? ";
            PreparedStatement ss = con.prepareStatement(Query);
            ss.setDate(1,java.sql.Date.valueOf(date));
            ResultSet rs = ss.executeQuery();
            if(rs.next())
            return false;
            else
            return true;
         }   
    
}
