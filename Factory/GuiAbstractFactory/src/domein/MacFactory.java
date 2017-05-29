package domein;

public class MacFactory implements GuiFactory {

    public Component createButton() {
        // TODO - implement MacFactory.createButton
        return new MacButton();
    }

    public Component createLabel() {
        // TODO - implement MacFactory.createLabel
        return new MacLabel();
    }

}
