package Sutheshpackage.Controller;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import Sutheshpackage.DBA.AttendanceDBA;
import Sutheshpackage.DBA.Employee_infoDBA;
import Sutheshpackage.Modal.attendrep;
import Sutheshpackage.Modal.employee;
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
                        ArrayList<employee>list =Employee_infoDBA.employeedetails();
                        Employeeinfoview.employee_inforeport(list);
                        break;}
                        case 2:{
                            System.out.print("Enter a date (yyyy-MM-dd)  : ");
                            String userInput1 =view.getString();
                            System.out.print("Enter a  date (yyyy-MM-dd) :");
                            String userInput2 = view.getString();
                            System.out.println();
                            DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                            LocalDate dt1 = LocalDate.parse(userInput1, dateformatter);
                    
                            LocalDate dt2 = LocalDate.parse(userInput2, dateformatter);
                            dt2 =dt2.plusDays(1);
                            // System.out.print(dt2.toString());
                            ArrayList<attendrep>list = AttendanceDBA.TotalReport(dateformatter.format(dt1), dateformatter.format(dt2));
                            System.out.println("Name    "+"NO_OF_DAYS"+"   PRESENTDAYS"+"Ouput" );
                            for(int i=0;i<list.size();i++)
                            {
                                System.out.print(list.get(i).getName()+" ");
                                System.out.print(list.get(i).getNo_of_days()+"     ");
                                System.out.print(list.get(i).getNo_presentdays()+"     ");
                                float f = list.get(i).getNo_of_days()/list.get(i).getNo_presentdays();
                                f = f*100; 
                                System.out.print(f+"%");
                                System.out.println("    "+list.get(i).getOutput()+"   ");
                            }
                            break;
                        }

                        case 3:{
                            System.out.print("Enter a date (yyyy-MM-dd)  : ");
                            String userInput1 =view.getString();
                            System.out.print("Enter a  date (yyyy-MM-dd) :");
                            String userInput2 = view.getString();
                            System.out.println();
                            DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                            LocalDate dt1 = LocalDate.parse(userInput1, dateformatter);
                    
                            LocalDate dt2 = LocalDate.parse(userInput2, dateformatter);
                            dt2 =dt2.plusDays(1);
                            // System.out.print(dt2.toString());
                            ArrayList<attendrep>list = AttendanceDBA.TotalReport(dateformatter.format(dt1), dateformatter.format(dt2));
                            System.out.println("Name    "+"NO_OF_DAYS"+"   PRESENTDAYS" );
                            for(int i=0;i<list.size();i++)
                            {
                                System.out.print(list.get(i).getName()+" ");
                                System.out.print(list.get(i).getNo_of_days()+"    ");
                                System.out.println(list.get(i).getNo_presentdays()+"    ");
                                // System.out.println(list.get(i).getOutput()+"   ");
                            }
                            break;
                        }
                        case 4:{
                            System.exit(200);
                        }
                    }
                        break;
                }
                case 3:{
                  


                    
                }
                }
                // case 2->
            }

    }
