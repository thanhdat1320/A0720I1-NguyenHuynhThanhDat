package model;

public class Product {
    private String nameProduct;
    private double price;
    private double discount;

    public Product() {
    }

    public Product(String nameProduct, double price, double discount) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.discount = discount;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
