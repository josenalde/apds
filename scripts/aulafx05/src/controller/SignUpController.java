package controller;

import java.net.URL;
import java.util.ResourceBundle;

import dao.DBUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class SignUpController implements Initializable {

	@FXML
	private Button btnsignup;
	
	@FXML
	private TextField txtusername;
	
	@FXML
	private PasswordField txtpassword;
	
	@FXML
	private Button btnlogin;
	
	@FXML
	private RadioButton rbeaj;
	
	@FXML
	private RadioButton rbufrn;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// é necessário agrupar os radio buttons num togglegroup, uma vez que só um pode estar ativo por vez
		ToggleGroup tg = new ToggleGroup();
		rbeaj.setToggleGroup(tg);
		rbufrn.setToggleGroup(tg);
		rbeaj.setSelected(true);
		
		btnsignup.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String toggleName = ((RadioButton) tg.getSelectedToggle()).getText();
				if (!txtusername.getText().trim().isEmpty() && !txtpassword.getText().trim().isEmpty()) {
					DBUtils.signUpUser(event, txtusername.getText(), txtpassword.getText(), toggleName);
				} else {
					System.out.println("Please fill in all information!");
					Alert alert = new Alert(Alert.AlertType.ERROR);
					alert.setContentText("All data must be filled");
					alert.show();
				}
			}
		});
		
		btnlogin.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				DBUtils.changeScene(event, "/view/main.fxml", "Log In!", null, null);
			}
		});
	}

}
