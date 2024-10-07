package org.example;

public class MacOsFactory implements IGUIFactory {

    @Override
    public IButton createButton() {
        return new MacOsButton();
    }

    @Override
    public  ICheckbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
