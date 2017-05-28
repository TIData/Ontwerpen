package domein;

public class Menu {

    private String drink;
    private String mainCourse;
    private String side;

    public String getDrink() {
        return this.drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getMainCourse() {
        return this.mainCourse;
    }

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    public String getSide() {
        return this.side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String toString() {
        return String.format("Drink: %s%nMain course: %s%nSide: %s%n", drink, mainCourse, side);
    }
}
