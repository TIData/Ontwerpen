package domein;

public class WinFactory implements GuiFactory {

    @Override
    public Component createButton() {
        return new WinButton();
    }

    @Override
    public Component createLabel() {
        return new WinLabel();
    }
}
