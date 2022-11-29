package controller;

import javafx.event.EventHandler;
import java.net.URL;
import java.util.ResourceBundle;

import dao.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/*implements Initializable e seu método initialize adicionados, o que ocorre ao carregar a cena controlada por este arquivo
  Interface usada para inicialização deste controlador; o método initialize() é chamado após os elementos com anotação FXML terem sido injetados
*/
public class LoggedInController implements Initializable { 

	@FXML
	private Button btnlogout; //exatamente como no fx:id (code) do scene builder
	
	@FXML
	private Label lblwelcome;
	
	@FXML
	private Label lblfavchannel;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// ao clicar no botão volta à tela inicial de log in (main.fxml)
		btnlogout.setOnAction(new EventHandler<ActionEvent>()  {
			@Override
			public void handle(ActionEvent event) {
				DBUtils.changeScene(event, "/view/main.fxml", "Log In!", null, null);
			}
	});
	
	}
	
	// método para montar label dinâmica de acordo com BD
	public void setUserInformation(String username, String favchannel) {
		lblwelcome.setText("Welcome " + username + "!");
		lblfavchannel.setText("Your favorite YouTube channel is " + favchannel + "!");
	}

}
