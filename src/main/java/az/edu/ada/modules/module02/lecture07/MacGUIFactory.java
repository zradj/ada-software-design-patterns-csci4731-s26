package az.edu.ada.modules.module02.lecture07;

public class MacGUIFactory extends GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
