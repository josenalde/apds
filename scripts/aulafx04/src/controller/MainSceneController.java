package controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MainSceneController {
	public MainSceneController() {
		
	}
	@FXML
	private Button btnlogin;
	@FXML
	private Label lblerrorlogin;
	@FXML
	private TextField txtusername;
	@FXML
	private PasswordField txtpassword;
	
	// método definido no onAction do botão Log In
	public void onLoginClick(ActionEvent event) throws IOException {
		checkLogin();
	}
	
	private void checkLogin() throws IOException {
		Main m = new Main(); //para usar métodos definidos no Application
		
		String user = "josenalde";
		String pass = "123";
		
		if (txtusername.getText().toString().equals(user) && txtpassword.getText().toString().equals(pass)) {
			lblerrorlogin.setText("Success...");
			m.changeScene("AfterLogin.fxml");
		}
		else if (txtusername.getText().isEmpty() && txtpassword.getText().isEmpty()) {
			lblerrorlogin.setText("Please enter your data");
		} else lblerrorlogin.setText("Wrong username or password");
	}
	
}
