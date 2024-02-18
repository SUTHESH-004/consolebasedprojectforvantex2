package Sutheshpackage.Controller;

import java.sql.SQLException;

import Sutheshpackage.DBA.*;
import Sutheshpackage.Modal.IdPass;
import Sutheshpackage.views.*;

public class App {

    public static void Start() throws SQLException {
        Mainview a = new Mainview();
        // a.welcomeDisplay();

        IdPass idpass = a.passwordisplay();
        PostsDBA postsDBA = new PostsDBA();
        PasswordDBA passwordDBA = new PasswordDBA();

        // i have checked the password is correct or not if not loop
        boolean dir = passwordDBA.passwordverfication(idpass);
        if (dir == false) {
            System.out.println("Your password is incorrect ");
            Start();
            System.exit(200);
        } else {
            int position = postsDBA.positionChecker(idpass.emp_id);
            if (position == 2) {
                Supervisorview view = new Supervisorview();
                view.welcomeSupervisor();
                Supervisor.enter(idpass.emp_id, position);
                
            }

        }
    }
}
