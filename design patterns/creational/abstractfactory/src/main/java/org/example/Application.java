package org.example;

public class Application {

    private final IButton button;
    private final ICheckbox checkbox;

    public Application(IGUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.render();
    }
}
