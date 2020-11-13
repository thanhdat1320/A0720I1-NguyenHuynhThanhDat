package furama_resort.models;

public class Villa extends Services {
    private String standardRoom;
    private String areaPool;
    private String floor;
    private String otherFacilities;

    public Villa() {
    }

    public Villa(String standardRoom, String otherFacilities, String areaPool, String floor) {
        this.standardRoom = standardRoom;
        this.otherFacilities = otherFacilities;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public Villa(String id, String name, String area, String price, String amount, String typeRents, String standardRoom,
                 String otherFacilities, String areaPool, String floor) {
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

    public String getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(String areaPool) {
        this.areaPool = areaPool;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }


    @Override
    public String showInfo() {
        return "Villa[ Name: " + getName() +
                ", ID: " + getId() +
                ", Area: " + getArea() +
                ", Amount: " + getAmount() +
                ", Price: " + getPrice() +
                ", TypeRent: " + getTypeRents() +
                ", standardRoom: " + getStandardRoom() +
                ", otherFacilities: " + getOtherFacilities() +
                ", areaPool: " + getAreaPool() +
                ", floor: " + getFloor() +
                ']';
    }

    @Override
    public String toString() {
        return getName() + "," + getId() + "," + getArea() + "," + getAmount() + "," + getPrice() + "," +
                getTypeRents() + "," + standardRoom + "," + areaPool + "," + floor + "," + otherFacilities;
    }
}
