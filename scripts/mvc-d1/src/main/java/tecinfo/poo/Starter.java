package tecinfo.poo;

/*
 * JavaFX only supports being loaded as named modules. In other words, JavaFX only supports being loaded from the module-path,
 * not the class-path. This has been implicitly true since version 9, back when the framework was modularized. 
 * But now, as of version 16, a warning is emitted if JavaFX detects it was loaded from the class-path (i.e. is in the unnamed module).
 * WARNING: Unsupported JavaFX configuration: classes were loaded from 'unnamed module @44f2c786'
 * 
 * Note when JavaFX is loaded from the unnamed module (i.e., class-path), then the main class cannot be a subtype of 
 * javafx.application.Application. You must define a separate main class whose main method simply launches the JavaFX application. 
 * This is true for JavaFX 9 up to and including at least JavaFX 21.
 * 
 * Ignore the warning: https://stackoverflow.com/questions/67854139/javafx-warning-unsupported-javafx-configuration-classes-were-loaded-from-unna
 */
public class Starter {
    public static void main(String[] args) {
        App.main(args);
    }
}
