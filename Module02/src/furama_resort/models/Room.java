package furama_resort.models;

public class Room extends Services {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String name, int area, int price, int amount, String typeRents, String freeService) {
        super(id, name, area, price, amount, typeRents);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String showInfo() {
        return "Room[ ID: " + getId() +
                ", Name: " + getName() +
                ", Area: " + getArea() +
                ", Price: " + getPrice() +
                ", Amount: " + getAmount() +
                ", TypeRent: " + getTypeRents() +
                ", FreeService: " + getFreeService() +
                ']';
    }

    @Override
    public String toString() {
        return freeService;
    }
}
