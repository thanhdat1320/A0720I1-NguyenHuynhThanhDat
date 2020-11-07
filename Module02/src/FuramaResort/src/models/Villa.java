package models;

public class Villa extends Services {
    private String standardRoom;
    private String otherFacilities;
    private int areaPool;
    private int floor;

    public Villa() {

    }

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

    public int getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(int areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public void showInfo() {
        System.out.println("Villa[ " +
                "standardRoom:'" + getStandardRoom() + '\'' +
                ", otherFacilities:'" + getOtherFacilities() + '\'' +
                ", areaPool:" + getAreaPool() +
                ", floor:" + getFloor() +
                ']');
    }
}
