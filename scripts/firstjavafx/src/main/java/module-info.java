module br.ufrn.tads {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens br.ufrn.tads.controller to javafx.fxml;
    exports br.ufrn.tads;
}
