package domein;

public class Location {

    private String location;
    
    public Location(String newLocation) {
        setLocation(newLocation);
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    @Override
    public String toString() {
        return location;
    }
}
