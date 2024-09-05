package tecinfo.poo.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection c;

    public static void openConnection() {
        c = null;
        try {
            String dburl = "jdbc:postgresql://localhost:5433/dbproducts"; // default port is 5432 (check)
            c = DriverManager.getConnection(dburl, "postgres", "gadoyhovy"); // server password
            if (c != null) {
                System.out.println("Connected to database #1");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (c != null && !c.isClosed()) {
                    c.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public Connection getConnection() {
        return c;
    }
}