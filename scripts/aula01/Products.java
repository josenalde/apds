/**
 *
 * @author josen
 */
public class Products { //fluxo de objetos em bytes (persistir em arquivo o objeto ou trafegar na rede
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

