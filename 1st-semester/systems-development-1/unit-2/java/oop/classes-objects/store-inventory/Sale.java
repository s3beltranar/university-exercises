import java.util.ArrayList;

public class Sale {

    // * Attributes
    private int client_code, sale_hour;
    private ArrayList<Product> products_list;

    // * Consruct.
    public Sale(int client_code, int sale_hour, ArrayList<Product> products_list) {
        this.client_code = client_code;
        this.sale_hour = sale_hour;
        this.products_list = products_list;
    }

    // * Getters.
    public int getClient_Code() {
        return client_code;
    }
    public int getSale_Hour() {
        return sale_hour;
    }
    public ArrayList<Product> getProducts_List() {
        return products_list;
    }

    // * Setters.
    public void setClient_Code(int client_code) {
        this.client_code = client_code;
    }
    public void setSale_Hour(int sale_hour) {
        this.sale_hour = sale_hour;
    }
    public void setProducts_List(ArrayList<Product> products_list) {
        this.products_list = products_list;
    }
}