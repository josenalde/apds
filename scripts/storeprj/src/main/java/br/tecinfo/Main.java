package br.tecinfo;

import br.tecinfo.repository.util.DBConnection;

public class Main {
    public static void main(String[] args) {
        DBConnection.getConnection();
    }
}