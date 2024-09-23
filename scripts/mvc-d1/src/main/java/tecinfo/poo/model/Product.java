package tecinfo.poo.model;

public class Product {
    private Long id;
    private Long quantity;
    private String name;
    private Float value;

    public Product() {
    }
    
    public Product(String name, Long quantity, Float value) {
        this.name = name;
        this.quantity = quantity;
        this.value = value;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getQuantity() {
        return quantity;
    }
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Float getValue() {
        return value;
    }
    public void setValue(Float value) {
        this.value = value;
    }
}
