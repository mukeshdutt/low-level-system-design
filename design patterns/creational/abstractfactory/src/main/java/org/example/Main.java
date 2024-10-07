package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Application app;
        IGUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("windows")){
            factory = new WindowsFactory();
        } else if(osName.contains("mac")) {
            factory = new MacOsFactory();
        } else {
            throw new UnsupportedOperationException("Unsupported Os" + osName);
        }

        app = new Application(factory);
        app.paint();
    }
}