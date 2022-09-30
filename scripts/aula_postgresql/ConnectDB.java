package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB {

	private String url;
	private String user;
	private String password;
	
	public ConnectDB(String url, String user, String password) {
		super();
		this.url = url;
		this.user = user;
		this.password = password;
	}



	public void connect() {
		try(Connection connection = DriverManager.getConnection(url, user, password);) {
			if (connection != null) {
				System.out.println("Connected...");
			} else System.out.println("Failed to connect...");
			Statement sqlQuery = connection.createStatement();
			ResultSet rset = sqlQuery.executeQuery("SELECT * from tbproducts");
			
			while (rset.next()) {
				System.out.println(rset.getString("nome") + "," + rset.getInt("quantidade") + "," + rset.getDouble("valor"));
			}
			//inserindo item
			//String query_1 = "INSERT INTO tbproducts (nome,quantidade,valor) VALUES ('Celular samsung', 50, 150.23)";
			//sqlQuery.executeUpdate(query_1);
			
			//String query_2 = "DELETE FROM tbproducts WHERE nome LIKE 'Celular%'";
			//sqlQuery.executeUpdate(query_2);
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
			
	}	
}


