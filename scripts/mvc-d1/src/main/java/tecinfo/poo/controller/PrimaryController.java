package tecinfo.poo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import tecinfo.poo.App;
import tecinfo.poo.model.Product;
import tecinfo.poo.model.dao.ProductDao;
//import tecinfo.poo.model.dao.DBConnection;

import javafx.event.ActionEvent;
//import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class PrimaryController {

    @FXML
    private ImageView img_dice_moving;

    //@FXML
    //private Button primaryButton;

    @FXML
    void switchDiceImage(MouseEvent event) {
        img_dice_moving.setFitHeight ( 250 );
        img_dice_moving.setFitWidth ( 250 );
        // supported image types: BMP, GIF, JPEG, PNG
        // src/main/resources/img directory inserted into resources tag in pom.xml, thus one has direct reference for Image
        img_dice_moving.setImage(new Image("dice_static.jpg")); 
    }

    @FXML
    private void switchToSecondary(ActionEvent event) throws IOException {
        System.out.println("changing to secondary");
        //DBConnection.getConnection();
        List<Product> products = new ArrayList<Product>();
        ProductDao productDao = new ProductDao();
        System.out.println("LISTAGEM DE PRODUTOS NO BANCO DE DADOS");
        System.out.println("----------------------------------------");
        products = productDao.getAll();
        if (products.size() > 0) {
            for (int i = 0; i < products.size(); i++) {
                System.out.print("id: " + products.get(i).getId());
                System.out.print(", name: " + products.get(i).getName());
                System.out.print(", quantity: " + products.get(i).getQuantity());
                System.out.println(", value: " + products.get(i).getValue());
            }
        }
        
        //Product productA = new Product("ventilador", 5L, 240.50f);
        //Product productB = new Product("lego mindstorms", 1L, 2000.00f);

        //productDao.save(productA);
        //productDao.save(productB);

        /*products = productDao.getAll();
        if (products.size() > 0) {
            for (int i = 0; i < products.size(); i++) {
                System.out.print("id: " + products.get(i).getId());
                System.out.print(", name: " + products.get(i).getName());
                System.out.print(", quantity: " + products.get(i).getQuantity());
                System.out.println(", value: " + products.get(i).getValue());
            }
        }*/

        //Product productA = new Product();
        //productA = productDao.get(7L);
        //productA.setName("ventoinha de pc");
        //productA.setValue(100f);
        //productDao.update(productA, null);

        /*products = productDao.getAll();
        if (products.size() > 0) {
            for (int i = 0; i < products.size(); i++) {
                System.out.print("id: " + products.get(i).getId());
                System.out.print(", name: " + products.get(i).getName());
                System.out.print(", quantity: " + products.get(i).getQuantity());
                System.out.println(", value: " + products.get(i).getValue());
            }
        }*/

        //productDao.delete(productA);

        /*products = productDao.getAll();
        if (products.size() > 0) {
            for (int i = 0; i < products.size(); i++) {
                System.out.print("id: " + products.get(i).getId());
                System.out.print(", name: " + products.get(i).getName());
                System.out.print(", quantity: " + products.get(i).getQuantity());
                System.out.println(", value: " + products.get(i).getValue());
            }
        }*/

        App.setRoot("secondary");
    }
}
