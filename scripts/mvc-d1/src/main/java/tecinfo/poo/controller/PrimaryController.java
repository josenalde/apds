package tecinfo.poo.controller;

import java.io.IOException;
import javafx.fxml.FXML;
import tecinfo.poo.App;
import tecinfo.poo.model.dao.DBConnection;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        System.out.println("changing to secondary");
        DBConnection.openConnection();
        App.setRoot("secondary");
    }
}
