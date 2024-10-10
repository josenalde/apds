module tecinfo.poo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;

    opens tecinfo.poo.controller to javafx.fxml;

    exports tecinfo.poo;
} 