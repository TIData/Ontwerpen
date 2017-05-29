package domein;

public class WinFactory implements GuiFactory {

    public Component createButton() {
        // TODO - implement WinFactory.createButton
        return new WinButton();
    }

    public Component createLabel() {
        // TODO - implement WinFactory.createLabel
        return new WinLabel();
    }

}
