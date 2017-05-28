package domein;

public class StatisticsDocument implements Document {

    @Override
    public void open() {
        System.out.println("Statistics document is open");
    }

    @Override
    public void close() {
        System.out.println("Statistics document is closed");
    }

}
