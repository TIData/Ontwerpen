package domein;

public abstract class MenuBuilder {

    private Menu menu;

    public Menu getMenu() {
        return this.menu;
    }

    public void createNewMenu() {
        menu = new Menu();
    }

    public abstract void applyDrink();

    public abstract void applyMainCourse();

    public abstract void applySide();
}
