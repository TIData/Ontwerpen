package domein;

public class ApplicationFactory {

    public static Application createApplication(String type) {
        switch (type) {
            case "drawing":
                return new DrawingApplication();
            case "statistics":
                return new StatisticsApplication();
            default:
                return null;
        }
    }
}
