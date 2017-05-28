package domein;

public class ExternalTask extends Task {

    public ExternalTask(String name, String description, double taskTimeRequired, double rate) {
        super(name, description, rate, taskTimeRequired);
    }

    @Override
    protected boolean vatInclusive() {
        return true;
    }
}
