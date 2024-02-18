package Sutheshpackage.Controller;

import java.sql.SQLException;

import Sutheshpackage.DBA.AttendanceDBA;
import Sutheshpackage.DBA.Employee_infoDBA;
import Sutheshpackage.views.*;

public class Supervisor {
    public static void enter(int emp_id,int position) throws SQLException {     
        Supervisorview view = new Supervisorview();
        int choice = 0;
            view.displayMenu();
            try {
                choice = view.getInt();
            } catch (Exception e) {
                view.print("Enter a Valid Input");
                enter(emp_id,position);
                view.print("Ended succesfully");
                System.exit(200);
            }
            switch(choice)
            {
                case 1:{ boolean a=AttendanceDBA.entryStatus(emp_id,position);
                        if(a==true)
                        {
                            enter(emp_id, position);
                        }
                        else
                        {
                            System.exit(200);
                        }

                    break;}
                case 2:{
                    Employeeinfoview.displayreport(); 
                    int reportchoice = view.getInt();
                    switch(reportchoice)
                    {
                        case 1:{ 
                        Employee_infoDBA.employeedetails();
                    }

                }
                }
                // case 2->
            }

    }
}
