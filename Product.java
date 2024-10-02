import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private String id;

    public static int productCount = 0;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.id = String.format("%03d", productCount++);
    }
    public Product(String name, double price) {
        this(name, price, 0);
    }

    public Product(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public static int getProductCount() {
        return productCount;
    }

    public static void setProductCount(int productCount) {
        Product.productCount = productCount;
    }

    @Override
    public boolean equals(Object id){
        if(this==id )
            return true;
        if(id == null || getClass() != id.getClass())
            return false;
        Product product = (Product)id;
        return Objects.equals(id,product.id);
    }

    public String toString(){
        return String.format(" Product ID : %s\n Name: %s\n Price: %.2f\n  Quantity: %d\n", id, name, price, quantity);
    }
}
