package tecinfo.poo.controller;

import java.io.IOException;
import javafx.fxml.FXML;
import tecinfo.poo.App;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        System.out.println("changing to primary");
        App.setRoot("primary");
    }
}