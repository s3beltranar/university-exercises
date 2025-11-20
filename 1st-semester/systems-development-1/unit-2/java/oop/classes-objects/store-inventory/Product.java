public class Product {

    // * Attributes.
    private int code, stock;
    private String name;
    private float price;

    // * Construct.
    public Product(int product_code, int product_stock, String product_name, float product_price) {
        this.code = product_code;
        this.stock = product_stock;
        this.name = product_name;
        this.price = product_price;
    }

    // * Getters.
    public int getCode() {
        return code;
    }
    public int getStock() {
        return stock;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }

    // * Setters.
    public void setCode(int product_code) {
        this.code = product_code;
    }
    public void setStock(int product_stock) {
        this.stock = product_stock;
    }
    public void setName(String product_name) {
        this.name = product_name;
    }
    public void setPrice(float product_price) {
        this.price = product_price;
    }
}