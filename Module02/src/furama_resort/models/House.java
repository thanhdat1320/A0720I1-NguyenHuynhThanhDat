package furama_resort.models;

public class House extends Services {
    private String standardRoom;
    private String otherFacilities;
    private int floor;

    public House() {
    }

    public House(String standardRoom, String otherFacilities, int floor) {
        this.standardRoom = standardRoom;
        this.otherFacilities = otherFacilities;
        this.floor = floor;
    }

    public House(String id, String name, int area, int price, int amount, String typeRents, String standardRoom,
                 String otherFacilities, int floor) {
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

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public void showInfo() {
        System.out.println("House[" +
                "standardRoom: '" + getStandardRoom() + '\'' +
                ", otherFacilities: '" + getOtherFacilities() + '\'' +
                ", floor: " + getFloor() +
                ']');
    }
}
