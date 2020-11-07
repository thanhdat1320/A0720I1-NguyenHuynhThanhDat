package models;

public class House extends Services {
    private String standardRoom;
    private String otherFacilities;
    private int floor;

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

    @Override
    public void showInfo() {
        System.out.println("House[" +
                "standardRoom: '" + standardRoom + '\'' +
                ", otherFacilities: '" + otherFacilities + '\'' +
                ", floor: " + floor +
                ']');
    }
}
