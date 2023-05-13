package patterns.cretional.abstractFactory.checkboxs;

import java.util.concurrent.ScheduledExecutorService;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint(){
        System.out.println("You have created WindowsCheckbox");
    }
}
