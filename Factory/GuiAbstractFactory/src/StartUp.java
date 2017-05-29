import domein.OperatingSystem;
import domein.Screen;

public class StartUp {

    public static void main(String args[]) {
        new StartUp().run();
    }

    private void run() {
        Screen winScreen = OperatingSystem.createScreen("win");
        winScreen.addButton();
        winScreen.addLabel();
        winScreen.viewComponents();
        Screen macScreen = OperatingSystem.createScreen("mac");
        macScreen.addButton();
        macScreen.addLabel();
        macScreen.addLabel();
        macScreen.viewComponents();
    }

}
