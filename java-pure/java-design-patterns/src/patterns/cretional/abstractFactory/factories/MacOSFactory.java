package patterns.cretional.abstractFactory.factories;

import patterns.cretional.abstractFactory.buttons.Button;
import patterns.cretional.abstractFactory.buttons.MacOSButton;
import patterns.cretional.abstractFactory.checkboxs.Checkbox;
import patterns.cretional.abstractFactory.checkboxs.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
