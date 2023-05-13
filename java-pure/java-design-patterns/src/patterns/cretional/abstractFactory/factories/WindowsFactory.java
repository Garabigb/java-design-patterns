package patterns.cretional.abstractFactory.factories;

import patterns.cretional.abstractFactory.buttons.Button;
import patterns.cretional.abstractFactory.buttons.WindowsButton;
import patterns.cretional.abstractFactory.checkboxs.Checkbox;
import patterns.cretional.abstractFactory.checkboxs.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
