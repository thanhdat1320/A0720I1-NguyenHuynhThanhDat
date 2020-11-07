package models;

public class Villa extends Services {
    private String standardRoom;
    private String otherFacilities;
    private int areaPool;
    private int floor;

    public Villa(String standardRoom, String otherFacilities, int areaPool, int floor) {
        this.standardRoom = standardRoom;
        this.otherFacilities = otherFacilities;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public Villa(String id, String name, int area, int price, int amount, String typeRents, String standardRoom,
                 String otherFacilities, int areaPool, int floor) {
        super(id, name, area, price, amount, typeRents);
        this.standardRoom = standardRoom;
        this.otherFacilities = otherFacilities;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    @Override
    public void showInfo() {
        System.out.println("Villa[ " +
                "standardRoom:'" + standardRoom + '\'' +
                ", otherFacilities:'" + otherFacilities + '\'' +
                ", areaPool:" + areaPool +
                ", floor:" + floor +
                ']');
    }
}
