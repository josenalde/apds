package br.ufrn.tads.controller;

import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//import br.ufrn.tads.App;
import br.ufrn.tads.model.Product;
import br.ufrn.tads.service.ProductService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PrimaryController {
    private ProductService productService;

    @FXML
    private Label lblDateTime;

    @FXML
    private Label lblMsg;

    @FXML
    private Button listButton;

    @FXML
    private Button addButton;

    @FXML
    private TableView<Product> tbvProducts;

    @FXML
    private TableColumn<Product, Long> colId;

    @FXML
    private TableColumn<Product, String> colName;

    @FXML
    private TableColumn<Product, Long> colQuantity;

    @FXML
    private TableColumn<Product, Float> colValue;


    public PrimaryController() {
        System.out.println("Constructor method");
    }

    //@SuppressWarnings("unchecked")
    @FXML
    public void initialize() {
        System.out.println("Init method");
        Image img = new Image("listicon.png");
        ImageView imgView = new ImageView(img);
        listButton.setGraphic(imgView);
        
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtFmt = DateTimeFormatter.ofPattern("dd-MM-yyyy, HH:mm:ss");
        String nowFmt = dtFmt.format(now);
        lblDateTime.setText(nowFmt);

        //SE NÃO CRIOU COLUNAS NO SCENE BUILDER, ADICIONARIA AQUI OS TABLECOLUMNS
        //tbvProducts.getColumns().addAll(colId, colName, colQuantity, colValue);
        
        colId.setCellValueFactory(new PropertyValueFactory<>("id")); // colunas tal como no BD
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        colValue.setCellValueFactory(new PropertyValueFactory<>("value"));

    }

    @FXML
    private void listProducts(ActionEvent event) throws IOException {
        productService = new ProductService();
        
        ObservableList<Product> list = FXCollections.observableArrayList(productService.getProducts());
        tbvProducts.setItems(list);     
        
        // NO CONSOLE
        //List<Product> list = new ArrayList<Product>();
        //list = productService.getProducts();
        /*System.out.println("LISTAGEM DE PRODUTOS NO BANCO DE DADOS");
        System.out.println("----------------------------------------");
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                System.out.print("id: " + list.get(i).getId());
                System.out.print(", name: " + list.get(i).getName());
                System.out.print(", quantity: " + list.get(i).getQuantity());
                System.out.println(", value: " + list.get(i).getValue());
            }
        }*/
        
        lblMsg.setTextFill(Color.GREEN); 
        lblMsg.setText("Listagem realizada com sucesso...");
    }

    @FXML
    private void addProduct(ActionEvent event) throws IOException {
        // Ao clicar no botão pode abrir janela com formulário para inserir novo produto
        // As caixas de texto (TextField) possuem a propriedade getText
        Product product = new Product("abajur", 2L, 42.99f);
        productService = new ProductService();
        if (productService.save(product) == 1) {
            lblMsg.setTextFill(Color.GREEN); 
            lblMsg.setText("Inclusão realizada com sucesso...");
            //listProducts(event);
        } else {
            lblMsg.setTextFill(Color.RED); 
            lblMsg.setText("Erro no processamento da inclusão dos dados...");
        }
    }
}
