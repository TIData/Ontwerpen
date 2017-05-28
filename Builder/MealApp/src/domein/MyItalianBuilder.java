package domein;

public class MyItalianBuilder extends MenuBuilder {

    @Override
    public void applyDrink() {
        getMenu().setDrink("wijn");
    }

    @Override
    public void applyMainCourse() {
        getMenu().setMainCourse("pizza margherita");
    }

    @Override
    public void applySide() {
        getMenu().setSide("bread");
    }
}
