module tecinfo.poo {
    requires javafx.controls; //includes javafx.graphics
    requires javafx.fxml;
    requires java.sql;
    //requires javafx.graphics;

    opens tecinfo.poo.controller to javafx.fxml;

    exports tecinfo.poo;
}

//only works with -module <name> option during compilation
