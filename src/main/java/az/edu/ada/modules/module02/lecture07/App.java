package az.edu.ada.modules.module02.lecture07;

public class App {
    public static final String OS = "Win";

    public static void main(String[] args) {
        GUIFactory guiFactory = null;

        if (OS.equals("Win")) {
            guiFactory = new WinGUIFactory();
        } else if (OS.equals("Mac")) {
            guiFactory = new MacGUIFactory();
        }

        Button button = guiFactory.createButton();
        Checkbox checkbox = guiFactory.createCheckbox();

        button.render();
        checkbox.render();
    }
}
