package Sutheshpackage.views;

import Sutheshpackage.Modal.IdPass;

public class Mainview extends scan {
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
        System.out.println("");
        { // System.out.printf("%55s", " ");
          // System.out.print("__ __ _ ____ __ _ \n");
          // System.out.printf("%55s", " ");
          // System.out.print("\\ \\ / /_ _ _ __ | |_ _____ __ / ___| ___ / _| |___ ____ _
          // _ __ ___ \n");
          // System.out.printf("%55s", " ");
          // System.out.print(" \\ \\ / / _` | '_ \\| __/ _ \\ \\/ / \\___ \\ / _ \\| |_|
          // __\\ \\ /\\ / / _` | '__/ _ \\\n");
          // System.out.printf("%55s", " ");
          // System.out.print(" \\ V / (_| | | | | || __/> < ___) | (_) | _| |_ \\ V V /
          // (_| | | | __/\n");
          // System.out.printf("%55s", " ");
          // System.out.print(" \\_/ \\__,_|_| |_|\\__\\___/_/\\_\\ |____/ \\___/|_| \\__|
          // \\_/\\_/ \\__,_|_| \\___|");
          // System.out.println();
        }
    }

    public IdPass passwordisplay() {
        try {
            System.out.print("Enter your Employee_id :");
            int emp_id = sc.nextInt();
            System.out.print("Enter your Password :");
            String pass = sc.next();
            IdPass idpass = new IdPass(emp_id, pass);
            return idpass;
        } catch (Exception e) {
            System.out.println("Invalid Expression");
            return null;
        }
    }

}