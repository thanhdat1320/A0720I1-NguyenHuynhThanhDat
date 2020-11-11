package furama_resort.models;

public class House extends Services {
    private String standardRoom;
    private String otherFacilities;
    private String floor;

    public House() {
    }

    public House(String standardRoom, String otherFacilities, String floor) {
        this.standardRoom = standardRoom;
        this.otherFacilities = otherFacilities;
        this.floor = floor;
    }

    public House(String id, String name, int area, int price, int amount, String typeRents, String standardRoom,
                 String otherFacilities, String floor) {
        super(id, name, area, price, amount, typeRents);
        this.standardRoom = standardRoom;
        this.otherFacilities = otherFacilities;
        this.floor = floor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getOtherFacilities() {
        return otherFacilities;
    }

    public void setOtherFacilities(String otherFacilities) {
        this.otherFacilities = otherFacilities;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String showInfo() {
        return "House[ ID: " + getId() +
                ", Name: " + getName() +
                ", Area: " + getArea() +
                ", Price: " + getPrice() +
                ", Amount: " + getAmount() +
                ", TypeRent: " + getTypeRents() +
                ", standardRoom: " + getStandardRoom() +
                ", otherFacilities: " + getOtherFacilities() +
                ", floor: " + getFloor() +
                ']';
    }

    @Override
    public String toString() {
        return standardRoom + "," + floor + "," + otherFacilities;
    }
}
