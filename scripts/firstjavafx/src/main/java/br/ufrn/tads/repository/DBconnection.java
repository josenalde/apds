package br.ufrn.tads.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    private static final String USER = "postgres";
    private static final String PASSWORD = "gadoyhovy";
    private static final String URL_DB = "jdbc:postgresql://localhost:5433/dbproducts";

    public static Connection getConnection() {
        Connection conn = null; // a default null connection
        try {
            conn = DriverManager.getConnection(DBconnection.URL_DB, DBconnection.USER, DBconnection.PASSWORD); // server password
            if (conn != null) {
                System.out.println("Connected to database #1");
            }
        } catch (SQLException e) {
            System.out.println("Error when connecting...: " + e); //e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return conn;
    }
}
