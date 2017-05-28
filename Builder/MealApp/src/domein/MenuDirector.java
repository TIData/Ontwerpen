package domein;

public class MenuDirector {

    private MenuBuilder builder;

    public MenuDirector(MenuBuilder builder) {
        this.builder = builder;
    }

    public void buildMenu() {
        builder.createNewMenu();
        builder.applyDrink();
        builder.applyMainCourse();
        builder.applySide();
    }

    public Menu getMenu() {
        return builder.getMenu();
    }
}
