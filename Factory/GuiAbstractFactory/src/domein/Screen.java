package domein;

import java.util.ArrayList;
import java.util.List;

public class Screen {

    private GuiFactory factory;
    private List<Component> components;

    public Screen(GuiFactory factory) {
        //TODO
        this.factory = factory;
        components = new ArrayList<>();
    }

    public void addButton() {
        //TODO
        components.add(factory.createButton());
    }

    public void addLabel() {
        //TODO
        components.add(factory.createLabel());
    }

    public void viewComponents() {
        //TODO
        components.forEach(Component::show);
    }
}
