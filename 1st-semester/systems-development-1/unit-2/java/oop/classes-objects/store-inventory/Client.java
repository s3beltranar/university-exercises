public class Client {

    // * Attributes.
    private int code;
    private String name, email, phone, addres;

    // * Construct.
    public Client(int client_code, String client_name, String client_email, String client_phone, String client_addres) {
        this.code = client_code;
        this.name = client_name;
        this.email = client_email;
        this.phone = client_phone;
        this.addres = client_addres;
    }

    // * Getters.
    public int getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddres() {
        return addres;
    }

    // * Setters.
    public void setCode(int client_code) {
        this.code = client_code;
    }
    public void setName(String client_name) {
        this.name = client_name;
    }
    public void setEmail(String client_email) {
        this.email = client_email;
    }
    public void setPhone(String client_phone) {
        this.phone = client_phone;
    }
    public void setAddres(String client_addres) {
        this.addres = client_addres;
    }
}