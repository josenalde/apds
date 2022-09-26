/*
 COM FILE_4.java e PRODUCTS.CSV, incluir no pacote ENTITIES
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apds.file_1.entities;

import java.io.Serializable;

/**
 *
 * @author josen
 */
public class Products implements Serializable { //fluxo de objetos em bytes (persistir em arquivo o objeto ou trafegar na rede
    private String name;
    private Double price;
    private Integer quantity;
    
    public Products() {
    }
    
    //construtor com argumentos

    public Products(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Products{" + "name=" + name + ", price=" + price + ", quantity=" + quantity + '}';
    }
    
    
    
    
    
    
}
