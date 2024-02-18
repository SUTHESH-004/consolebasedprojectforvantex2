package Sutheshpackage;

import java.sql.SQLException;

import Sutheshpackage.Controller.App;
import Sutheshpackage.views.Mainview;

public class Main {
    public static void main(String[] args) throws SQLException {
        Mainview a = new Mainview();
        a.welcomeDisplay();
        App.Start();
    }
}
