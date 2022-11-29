package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.LoggedInController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

// Classe do tipo Utils, com métodos estáticos não instaciáveis
public class DBUtils {
	public static void changeScene(ActionEvent event, String fxmlFile, String title, String username, String favChannel) {
		Parent root = null; //classe base para todas as cenas, que possuem nós filhos
		
		if (username != null && favChannel != null) { // se o usuário está logado
			try {
				FXMLLoader loader = new FXMLLoader(DBUtils.class.getResource(fxmlFile));
				root = loader.load();
				LoggedInController loggedInController = loader.getController();
				loggedInController.setUserInformation(username, favChannel);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else { // senão o usuário está só alternando entre as janelas de log in e sign up
			try {
				root = FXMLLoader.load(DBUtils.class.getResource(fxmlFile));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow(); //getWindow retorna o stage onde está a cena em que houve o clique (evento)
		stage.setTitle(title);
		stage.setScene(new Scene(root, 600, 400));	
		stage.show();
	}
	
	public static void signUpUser(ActionEvent event, String username, String password, String favChannel) {
		Connection conn = null;
		PreparedStatement psInsert = null;
		PreparedStatement psCheckUserExists = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://localhost/eajdb", "postgres", "postgres");
			psCheckUserExists = conn.prepareStatement("SELECT * FROM tbusers WHERE username = ?");
			psCheckUserExists.setString(1, username);
			rs = psCheckUserExists.executeQuery();
			// forma de checar se rs retornou algo
			if (rs.isBeforeFirst()) {
				System.out.println("User already exists!");
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setContentText("You cannot use this username");
				alert.show();
			} else {
				psInsert = conn.prepareStatement("INSERT INTO tbusers (username, password, favchannel) VALUES (? ,? ,?)");
				psInsert.setString(1, username);
				psInsert.setString(2, password);
				psInsert.setString(3, favChannel);
				psInsert.executeUpdate();
				
				changeScene(event, "/view/logged-in.fxml", "Logged In!", username, favChannel);
			}
			
	   } catch (SQLException e) {
			e.printStackTrace();
	   } finally {
		    if (rs != null) {
		    	try {
		    		rs.close();
		    	} catch (SQLException e) {
		    		e.printStackTrace();
		    	}
		    }
		    if (psCheckUserExists != null) {
		    	try {
		    		psCheckUserExists.close();
		    	} catch (SQLException e) {
		    		e.printStackTrace();
		    	}
		    }
		    if (psInsert != null) {
		    	try {
		    		psInsert.close();
		    	} catch (SQLException e) {
		    		e.printStackTrace();
		    	}
		    }
		    if (conn != null) {
		    	try {
		    		conn.close();
		    	} catch (SQLException e) {
		    		e.printStackTrace();
		    	}
		    }
	   }
	}
	
	public static void logInUser(ActionEvent event, String username, String password) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://localhost/eajdb", "postgres", "postgres");
			ps = conn.prepareStatement("SELECT password, favchannel FROM tbusers WHERE username = ?");
			ps.setString(1, username);
			rs = ps.executeQuery();
			if (!rs.isBeforeFirst()) {
				System.out.println("User is not in database!");
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setContentText("Credentials are incorrect!");
				alert.show();
			} else {
				while (rs.next()) { //procura todos os usuarios com o username informado, qual faz o match da senha
					String retrievedPassword = rs.getString("password"); //obtém coluna password
					String retrievedChannel = rs.getString("favchannel");
					if (retrievedPassword.equals(password)) {
						changeScene(event, "/view/logged-in.fxml", "Welcome", username, retrievedChannel);
					} else {
						System.out.println("Passwords does not match");
						Alert alert = new Alert(Alert.AlertType.ERROR);
						alert.setContentText("Credentials are incorrect");
						alert.show();
					}
				}
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}


























