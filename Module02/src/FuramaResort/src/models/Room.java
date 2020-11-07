package models;

public class Room extends Services {
    private String freeService;

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String name, int area, int price, int amount, String typeRents, String freeService) {
        super(id, name, area, price, amount, typeRents);
        this.freeService = freeService;
    }

    @Override
    public void showInfo() {
        System.out.println("Room[" +
                "freeService: '" + freeService + '\'' +
                ']');
    }
}
