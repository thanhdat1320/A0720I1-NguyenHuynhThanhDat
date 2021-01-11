package model;

public class Product {
    private int id;
    private String name;
    private String provider;
    private String price;

    public Product() {
    }

    public Product(int id, String name, String provider, String price) {
        this.id = id;
        this.name = name;
        this.provider = provider;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
