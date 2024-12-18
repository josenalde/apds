package br.ufrn.tads.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import br.ufrn.tads.model.Product;
import br.ufrn.tads.service.ProductService;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.util.Duration;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PrimaryController {
    private ProductService productService;

    @FXML
    private Label lblDateTime;

    @FXML
    private Button listButton;

    @FXML
    private Button addButton;

    @FXML
    private Button delButton;

    @FXML
    private Button updButton;

    @FXML
    private Button clnButton;

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

    @FXML
    private ImageView imgvLogo;

    @FXML
    private TextField tfID;

    @FXML
    private TextField tfName;

    @FXML
    private TextField tfQuantity;

    @FXML
    private TextField tfValue;



    public PrimaryController() {
        // EXECUTADO PRIMEIRO
        productService = new ProductService();
    }

    @FXML
    public void initialize() {
        //EXECUTADO DEPOIS DO CONSTRUTOR
        
        Image img = new Image("listicon.png");
        ImageView imgView = new ImageView(img);
        listButton.setGraphic(imgView);

        img = new Image("nometads.png");
        imgvLogo.setImage(img);
        
        animateTimeLabel();

        //SE NÃO CRIOU COLUNAS NO SCENE BUILDER, ADICIONARIA AQUI OS TABLECOLUMNS
        //tbvProducts.getColumns().addAll(colId, colName, colQuantity, colValue);
        
        colId.setCellValueFactory(new PropertyValueFactory<>("id")); // colunas tal como no BD
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        colValue.setCellValueFactory(new PropertyValueFactory<>("value"));

        addButton.setVisible(true);
        updButton.setDisable(true);
        delButton.setDisable(true);
    }
    //método para obter itens da linha selecionada da tabela e copiar para o form com os text fields
    @FXML
    void getItem(MouseEvent event) {
        Integer idx = tbvProducts.getSelectionModel().getSelectedIndex();
        if (idx <= -1) return;
        tfID.setText(String.valueOf(colId.getCellData(idx)));
        tfName.setText(colName.getCellData(idx));
        tfQuantity.setText(String.valueOf(colQuantity.getCellData(idx)));
        tfValue.setText(String.valueOf(colValue.getCellData(idx)));

        addButton.setDisable(true);
        updButton.setDisable(false);
        delButton.setDisable(false);
    }
    
    @FXML
    private void listProducts(ActionEvent event) throws IOException {
                
        ObservableList<Product> list = FXCollections.observableArrayList(productService.getProducts());
        tbvProducts.setItems(list);     
        
    }

    @FXML
    private void addProduct(ActionEvent event) throws IOException {
        if (!tfName.getText().isEmpty() && !tfQuantity.getText().isEmpty() && !tfValue.getText().isEmpty()) {
            String name = tfName.getText();
            Long quantity = Long.parseLong(tfQuantity.getText());
            Float value = Float.parseFloat(tfValue.getText());
            Product product = new Product(name, quantity, value);

            if (productService.save(product)) {
                tbvProducts.getItems().add(product); //inclui na tableview, mas sem novo ID, pois primeiro precisa persistir no BD
            }
        }   
    }

    @FXML
    void delProduct(ActionEvent event) {
        if (!tfName.getText().isEmpty() && !tfQuantity.getText().isEmpty() && !tfValue.getText().isEmpty() && !tfID.getText().isEmpty()) {
            if (productService.delete(Long.parseLong(tfID.getText()))) {
                int idx = tbvProducts.getSelectionModel().getSelectedIndex();
                tbvProducts.getItems().remove(idx); //inclui na tableview, mas sem novo ID, pois primeiro precisa persistir no BD
                tfID.clear();
                tfName.clear();
                tfQuantity.clear();
                tfValue.clear();
            }
        }
    }

    @FXML
    void cleanForm(ActionEvent event) {
        if (!tfName.getText().isEmpty() && !tfQuantity.getText().isEmpty() && !tfValue.getText().isEmpty() && !tfID.getText().isEmpty()) {
            tfID.clear();
            tfName.clear();
            tfQuantity.clear();
            tfValue.clear();
            addButton.setDisable(false);
            updButton.setDisable(true);
            delButton.setDisable(true);
        }
    }

    @FXML
    void updProduct(ActionEvent event) {
        if (!tfName.getText().isEmpty() && !tfQuantity.getText().isEmpty() && !tfValue.getText().isEmpty() && !tfID.getText().isEmpty()) {
            String name = tfName.getText();
            Long quantity = Long.parseLong(tfQuantity.getText());
            Long id = Long.parseLong(tfID.getText());
            Float value = Float.parseFloat(tfValue.getText());
            Product product = new Product(id, name, quantity, value);
            productService.update(product, null);        
        }
    }

    void animateTimeLabel() {
        DateTimeFormatter dtFmt = DateTimeFormatter.ofPattern("dd-MM-yyyy, HH:mm:ss");

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            lblDateTime.setText(dtFmt.format(LocalDateTime.now()));
        }));
        timeline.setCycleCount(-1); //Animation.INDEFINITE (-1)
        timeline.play();
    }
}
