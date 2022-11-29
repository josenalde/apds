package controller;

import java.net.URL;
import java.util.ResourceBundle;

import dao.DBUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MainController implements Initializable {

	@FXML
	private Button btnlogin;
	
	@FXML
	private TextField txtusername;
	
	@FXML
	private PasswordField txtpassword;
	
	@FXML
	private Button btnsignup;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btnlogin.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				DBUtils.logInUser(event, txtusername.getText(), txtpassword.getText());
			}
		});
		
		btnsignup.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				DBUtils.changeScene(event, "/view/sign-up.fxml", "Sign Up!", null, null);
			} 
		});
	}
}
