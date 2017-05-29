package domein;

public class OperatingSystem {

    public static Screen createScreen(String type) {
        switch (type.toLowerCase()) {
            case "win":
                //TODO
                return new Screen(new WinFactory());
            case "mac":
                //TODO
                return new Screen(new MacFactory());
        }
        return null;
    }
}
