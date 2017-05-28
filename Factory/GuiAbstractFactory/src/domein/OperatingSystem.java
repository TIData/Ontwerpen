package domein;

public class OperatingSystem {

    public static Screen createScreen(String type) {
        switch (type.toLowerCase()) {
            case "win":
                return new Screen(new WinFactory());
            case "mac":
                return new Screen(new MacFactory());
            default:
                return null;
        }
    }
}
