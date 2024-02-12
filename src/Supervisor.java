import java.sql.SQLException;

// import com.mysql.cj.x.protobuf.MysqlxPrepare.ExecuteOrBuilder;

public class Supervisor extends scan{
    public static void enter() throws SQLException
    {
        int choice =0;
        int exe = 0;
        while(exe==0)
        {
        welcomeSupervisor();
        displayMenu();
        try{
         choice = sc.nextInt();
        }
        catch (Exception e)
        {
            System.out.print("Enter a Valid Input");
            enter();
        }
        switch(choice){
            case 1-> Entry.entryStatus(choice,2);
            case 2-> Report.enter();
            case 3-> Employee_info.Empenter();
            case 4-> {
                exe =4;
            }
        }
        if(exe ==4)
        {
            break;
        }
    }

    }

    public static void displayMenu() {
        System.out.println("Welcome! Press the numbers to indicate what you want to do:");
        System.out.println("1. Enter Attendance");
        System.out.println("2. View Reports");
        System.out.println("3. Check Employee Details");
        System.out.println("4. Exit");
    }
    public static void welcomeSupervisor() {
        // System.out.print("\033[H\033[2J");
        System.out.println(" ╔══════════════════════════════════════════╗ ");
        System.out.println(" ║                                          ║ ");
        System.out.println(" ║      WELCOME SUPERVISOR TO VANTEX SOFT   ║ ");
        System.out.println(" ║            EMPLOYEE DATABASE             ║ ");
        System.out.println(" ║                                          ║ ");
        System.out.println(" ╚══════════════════════════════════════════╝ ");
    }
}


