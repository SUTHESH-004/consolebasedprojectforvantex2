package Sutheshpackage.views;

public class Supervisorview extends scan{
        public void displayMenu() {
        System.out.println("Welcome! Press the numbers to indicate what you want to do:");
        System.out.println("1. Enter Attendance");
        System.out.println("2. View Reports");
        System.out.println("3. Check Employee Details");
        System.out.println("4. Exit");
    }
    public void welcomeSupervisor() {
        // System.out.print("\033[H\033[2J");
        System.out.println(" ╔══════════════════════════════════════════╗ ");
        System.out.println(" ║                                          ║ ");
        System.out.println(" ║      WELCOME SUPERVISOR TO VANTEX SOFT   ║ ");
        System.out.println(" ║            EMPLOYEE DATABASE             ║ ");
        System.out.println(" ║                                          ║ ");
        System.out.println(" ╚══════════════════════════════════════════╝ ");
    }
    public int getInt(){
        int s = sc.nextInt();
        return s;
    }
    public void print(String string)
    {
        System.out.print(string);
    }
    public void println(String s)
    {
        System.out.println(s);
    }
    public String getString()
    {
        String s = sc.next();
        return s;
    }
    

}