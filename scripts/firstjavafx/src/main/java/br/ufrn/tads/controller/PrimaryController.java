package br.ufrn.tads.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.ufrn.tads.App;
import br.ufrn.tads.model.Product;
import br.ufrn.tads.service.ProductService;
import javafx.fxml.FXML;

public class PrimaryController {
    private ProductService productService;

    @FXML
    private void switchToSecondary() throws IOException {
        productService = new ProductService();
        //System.out.println("deixando o primary para o secondary");
        //System.out.println(productService.testConnection());
        List<Product> list = new ArrayList<Product>();
        list = productService.getProducts();
        System.out.println("LISTAGEM DE PRODUTOS NO BANCO DE DADOS");
        System.out.println("----------------------------------------");
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                System.out.print("id: " + list.get(i).getId());
                System.out.print(", name: " + list.get(i).getName());
                System.out.print(", quantity: " + list.get(i).getQuantity());
                System.out.println(", value: " + list.get(i).getValue());
            }
        }
        
        App.setRoot("secondary");
    }
}
