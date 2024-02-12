import java.sql.*;

public class Report extends scan{
    public static void enter() throws SQLException{
        
        displayreport();
        int choice =0;
        choice = sc.nextInt();  
            switch(choice)
            {
                case 1->AttendanceReport(); 
            }
        }
    public static void  AttendanceReport() throws SQLException
        {
            Connection con = dbconnection.getconnection();
            
        }




        public static void displayreport()
        {
            System.out.println("1. Attendance report ");
            System.out.println("2. Wage report");
            System.out.println("3. for somthing");

        }




    }
