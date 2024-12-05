package br.ufrn.tads.controller;

import java.io.IOException;

import br.ufrn.tads.App;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}