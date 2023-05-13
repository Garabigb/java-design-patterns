package patterns.cretional.abstractFactory.factories;

import patterns.cretional.abstractFactory.buttons.Button;
import patterns.cretional.abstractFactory.checkboxs.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
