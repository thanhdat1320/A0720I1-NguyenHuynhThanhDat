package _12_java_collection_framework.exercise.manage_product_use_arraylist.models;

public class Product {
    private String name;
    private int id;
    private int price;

    public Product() {
    }

    public Product(String name, int id, int price) {
        this.id = id;
        this.name = name;
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

    public void setName(String nameProduct) {
        this.name = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product[" +
                "name: '" + name + '\'' +
                ", id: " + id +
                ", price: " + price +
                ']' + "\n";
    }
}
