package controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AfterLoginController {
	@FXML
	private Button btnlogout;
	
	public void onLogOutClick(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("MainScene.fxml");
	}
}
