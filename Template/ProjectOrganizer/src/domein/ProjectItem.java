package domein;

public abstract class ProjectItem {

    private String name;
    private String description;
    private double rate;

    private final static double VAT = 0.21;
    private double requiredTime;

    public ProjectItem(String newName, String newDescription, double newRate, double newRequiredTime) {
        name = newName;
        description = newDescription;
        rate = newRate;
        requiredTime = newRequiredTime;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getRate() {
        return rate;
    }

    public final double getCostEstimate() {
        double cost = getTimeRequired() * getRate() + getMaterialsCost();
        if (vatInclusive()) {
            cost = cost * (1 + VAT);
        }
        return cost;
    }

    protected boolean vatInclusive() {
        return false;
    }

    public double getMaterialsCost() {
        return 0;
    }

    public double getTimeRequired() {
        return requiredTime;
    }

    @Override
    public String toString() {
        return getName();
    }
}
