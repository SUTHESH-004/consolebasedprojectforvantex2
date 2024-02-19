package Sutheshpackage;

import java.sql.SQLException;

import Sutheshpackage.Controller.App;
import Sutheshpackage.DBA.Dbconnection;
// import Sutheshpackage.DBA.Dbconnection.*;
import Sutheshpackage.views.Mainview;

public class Main {
    public static void main(String[] args) throws SQLException {
        Dbconnection.connect();
        Mainview a = new Mainview();
        a.welcomeDisplay();
        App.Start();

    }
}
