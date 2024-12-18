module br.ufrn.tads {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;

    opens br.ufrn.tads.controller to javafx.fxml;
    opens br.ufrn.tads.model to javafx.base;
    exports br.ufrn.tads;
}
