package Sutheshpackage.views;
import Sutheshpackage.Modal.IdPass;

public class Mainview extends scan{
         public void welcomeDisplay() {
            // System.out.print("\033[H\033[2J");
            System.out.printf("%55s", " ");
            System.out.println(" ╔══════════════════════════════════════════╗ ");
            System.out.printf("%55s", " ");
            System.out.println(" ║                                          ║ ");
            System.out.printf("%55s", " ");
            System.out.println(" ║   WELCOME TO VANTEX SOFT - EMPLOYEE      ║ ");
            System.out.printf("%55s", " ");
            System.out.println(" ║                 DATA  BASE               ║ ");
            System.out.printf("%55s", " ");
            System.out.println(" ║                                          ║ ");
            System.out.printf("%55s", " ");
            System.out.println(" ╚══════════════════════════════════════════╝ ");
        }
        public IdPass passwordisplay()
        {
            try
            {System.out.print("Enter your Employee_id :");
            int emp_id = sc.nextInt();
            System.out.print("Enter your Password :");
            String pass = sc.next();
            IdPass idpass = new IdPass(emp_id,pass);
            return idpass;
            }
            catch (Exception e) {
                System.out.println("Invalid Expression");
                return null;
            }
        }
        
    
    
    }