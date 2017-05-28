package domein;

public class MacFactory implements GuiFactory {

    @Override
    public Component createButton() {
        return new MacButton();
    }

    @Override
    public Component createLabel() {
        return new MacLabel();
    }
}
