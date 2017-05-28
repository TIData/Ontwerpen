package domein;

import java.util.ArrayList;
import java.util.List;

public class Screen {

    private final GuiFactory factory;
    private List<Component> components;

    public Screen(GuiFactory factory) {
        this.factory = factory;
        components = new ArrayList<>();
    }

    public void addButton() {
        components.add(factory.createButton());
    }

    public void addLabel() {
        components.add(factory.createLabel());
    }

    public void viewComponents() {
        components.forEach(Component::show);
    }
}
