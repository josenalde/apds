package tecinfo.poo.controller;

import java.io.IOException;

import com.jfoenix.controls.JFXListView;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import tecinfo.poo.App;
import tecinfo.poo.model.Product;
import tecinfo.poo.model.dao.ProductDao;

public class SecondaryController {

    @FXML
    private JFXListView<Label> list; //o mesmo fx:id no scene builder
    
    @FXML
    private TableView<Product> tbvProducts;

    @FXML
    private void switchToPrimary() throws IOException {
        System.out.println("changing to primary");
        App.setRoot("primary");
    }

    public SecondaryController() {
        
    }

    @SuppressWarnings("unchecked")
    @FXML
    public void initialize() {
        Label label = new Label("Linha 1 com Label 1");
        list.setExpanded(true);
        list.getItems().add(label);
        Label label_2 = new Label("Linha 2 com Label 2");
        list.getItems().add(label_2);
        // se quiser associar uma imagem à Label
        // label.setGraphic(new ImageView(new Image(URL)))


        // criação colunas TableView, considerando que não foram criadas no scene builder. Preenche dados do CONSTRUTOR PRODUCT
        TableColumn<Product, Long> colId = new TableColumn<Product,Long>("id");
        TableColumn<Product, String> colName = new TableColumn<Product,String>("nome");
        TableColumn<Product, Long> colQuantity = new TableColumn<Product,Long>("quantidade");
        TableColumn<Product, Float> colValue = new TableColumn<Product,Float>("valor");
        
        tbvProducts.getColumns().addAll(colId, colName, colQuantity, colValue);
        
        // agora obtendo do banco de dados - se comentar as cinco linhas abaixo, insere apenas os dois objetos acima. Se descomentar, insere dados do BD ignorando acima
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        colValue.setCellValueFactory(new PropertyValueFactory<>("value"));

        tbvProducts.setItems(fillTableFromDB()); //este método é o que de fato insere os dados do BD no TableView
        
        // agora adicionando dados manualmente com o construtor
        
        colId.setCellValueFactory(data -> new SimpleLongProperty(data.getValue().getId()).asObject());
        colName.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getName()));
        colQuantity.setCellValueFactory(data -> new SimpleLongProperty(data.getValue().getQuantity()).asObject());
        colValue.setCellValueFactory(data -> new SimpleFloatProperty(data.getValue().getValue()).asObject());
        // preenchendo manualmente alguns dados
        tbvProducts.getItems().add(new Product(1L,"notebook HP", 10L, 100.35f));
        tbvProducts.getItems().add(new Product(2L,"notebook ACER", 1L, 1000.00f));


    }

    public ObservableList<Product> fillTableFromDB() {
        ProductDao productDao = new ProductDao();
        return FXCollections.observableArrayList(productDao.getAll()); // se usar return (ObservableList<Product>(...)) não funciona. É preciso usar o ArrayList do tipo Observable
    }
}