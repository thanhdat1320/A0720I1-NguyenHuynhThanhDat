package models;

public class Main {
    public static void main(String[] args) {
        Services services = new Room("12345", "thanhdat", 35, 36, 8,
                "month", "An sang");
        services.showInfo();
    }
}
