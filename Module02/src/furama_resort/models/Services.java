package furama_resort.models;

public abstract class Services {
    private String id;
    private String name;
    private int area;
    private int price;
    private int amount;
    private String typeRents;

    public Services() {
    }

    public Services(String id, String name, int area, int price, int amount, String typeRents) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.price = price;
        this.amount = amount;
        this.typeRents = typeRents;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTypeRents() {
        return typeRents;
    }

    public void setTypeRents(String typeRents) {
        this.typeRents = typeRents;
    }

    public abstract void showInfo();


}
