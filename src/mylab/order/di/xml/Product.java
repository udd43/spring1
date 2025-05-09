package mylab.order.di.xml;

public class Product {
    private String id;
    private String name;
    private double price;
    
    public Product() {} // 奄沙 持失切
    
    public Product(String id, String name, double price) { // 持失切
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    // Getter / Setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}
