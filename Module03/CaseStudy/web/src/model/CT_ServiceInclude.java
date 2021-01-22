package model;

public class CT_ServiceInclude {
    private int id;
    private String name;
    private int unit;
    private int price;
    private String status;

    public CT_ServiceInclude() {
    }

    public CT_ServiceInclude(int id, String name, int unit, int price, String status) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.status = status;
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

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
