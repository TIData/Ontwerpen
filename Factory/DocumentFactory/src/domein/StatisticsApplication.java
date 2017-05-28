package domein;

public class StatisticsApplication extends Application {

    @Override
    protected Document createDocument() {
        return new StatisticsDocument();
    }
}
