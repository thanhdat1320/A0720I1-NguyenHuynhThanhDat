package model;

public class SV_Service {
    private int id;
    private int idTypeRents;
    private int idTypeServices;
    private String name;
    private int area;
    private int floor;
    private String amount;
    private String price;
    private String status;

    public SV_Service() {
    }

    public SV_Service(int id, int idTypeRents, int idTypeServices, String name, int area, int floor, String amount, String price, String status) {
        this.id = id;
        this.idTypeRents = idTypeRents;
        this.idTypeServices = idTypeServices;
        this.name = name;
        this.area = area;
        this.floor = floor;
        this.amount = amount;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTypeRents() {
        return idTypeRents;
    }

    public void setIdTypeRents(int idTypeRents) {
        this.idTypeRents = idTypeRents;
    }

    public int getIdTypeServices() {
        return idTypeServices;
    }

    public void setIdTypeServices(int idTypeServices) {
        this.idTypeServices = idTypeServices;
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

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
