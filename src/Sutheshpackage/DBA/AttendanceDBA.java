package Sutheshpackage.DBA;

import java.sql.*;
import java.time.LocalDate;

import Sutheshpackage.Controller.Supervisor;
import Sutheshpackage.views.Supervisorview;

public class AttendanceDBA {
    // 100 means attendance put
    // 1 means continue
    // -1 means exit
    // 2 means continue on manager
    // -2 means  
    public static boolean entryStatus(int emp_id, int position) throws SQLException {
        Supervisorview view = new Supervisorview();
            Connection con = dbconnection.getconnection();
            LocalDate date = LocalDate.now();

            if (datechecker(date)) {
                String query = "select employee_name,employee_id from employeeinfo where posts_id not in(2)";
                Statement st = con.createStatement();
                ResultSet rp = st.executeQuery(query);
                // rp.next();
                System.out.println("Enter P to present | Enter A to absent ");
                while (rp.next()) {
                    String name = rp.getString(1);
                    view.print("Is" + name + " Present : ");
                    String state = view.getString();
                    String query1 = "insert into attendancesheet(employeeid,presentOrNot,dateOfwork,attendant_id)values(?,?,?,?);";
                    PreparedStatement stated = con.prepareStatement(query1);
                    stated.setInt(1, rp.getInt(2));
                    stated.setString(2, state);
                    // String date1 = date;
                    // Date date1 = date;
                    stated.setDate(3, java.sql.Date.valueOf(date));
                    stated.setInt(4, emp_id);
                    stated.executeUpdate();
                }
                String y = "insert into datedata values(?,?,?);";
                PreparedStatement ot = con.prepareStatement(y);
                ot.setBoolean(1, true);
                ot.setDate(2, java.sql.Date.valueOf(date));
                ot.setInt(3, emp_id);
                ot.executeUpdate();
                
            } 
            else {
                String query = "select employee_name from employeeinfo where employee_id= ?";
                PreparedStatement tt = con.prepareStatement(query);
                tt.setInt(1,emp_id);
                ResultSet yt = tt.executeQuery();
                yt.next();
                if (position == 2) {
                    view.print("Todays Attendance is already entered by the Supervisor \" " + yt.getString(1) + "\" ");
                }}
                view.print("do you want to continue ? press 1 to continue | press 4 exit");
                String a = view.getString();
                if (a.equals("1"))
                    return true;
                else{
                    // System.exit(200);
                    return false;
                }
        }

    private static Boolean datechecker(LocalDate date) throws SQLException {
        Connection con = dbconnection.getconnection();

        String Query = "Select isDate from datedata where dates = ? ";
        PreparedStatement ss = con.prepareStatement(Query);
        ss.setDate(1, java.sql.Date.valueOf(date));
        ResultSet rs = ss.executeQuery();
        if (rs.next())
            return false;
        else
            return true;
    }

}
