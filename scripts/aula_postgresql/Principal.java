package persistencia;

public class Principal {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost/dbproducts";
		String user = "postgres";
		String password = "postgresql";
		ConnectDB conn = new ConnectDB(url, user, password);
		conn.connect();
		
	}

}
