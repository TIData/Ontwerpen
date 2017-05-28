package domein;

public class MyJapaneseBuilder extends MenuBuilder {

    @Override
    public void applyDrink() {
        getMenu().setDrink("sake");
    }

    @Override
    public void applyMainCourse() {
        getMenu().setMainCourse("sushi");
    }

    @Override
    public void applySide() {
        getMenu().setSide("miso soep");
    }
}
