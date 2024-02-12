public class Vtxsoft extends scan {
    public static void main(String[] args) throws Exception {
        Entrypage.welcomeDisplay();
        int ptr = Position.positionChecker(Auth.passwordverfication());
        switch(ptr)
        {
            case 3-> Manager.enter();
            case 2-> Supervisor.enter();
        }
    }

    
}
