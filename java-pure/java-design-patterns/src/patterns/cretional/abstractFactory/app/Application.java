package patterns.cretional.abstractFactory.app;

import patterns.cretional.abstractFactory.buttons.Button;
import patterns.cretional.abstractFactory.checkboxs.Checkbox;
import patterns.cretional.abstractFactory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application (GUIFactory factory){
        button = factory.createButton();
        checkbox= factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public Checkbox getCheckbox() {
        return checkbox;
    }

    public void setCheckbox(Checkbox checkbox) {
        this.checkbox = checkbox;
    }
}
