package model;

public class EP_PositionEmployee {
    private int id;
    private String name;

    public EP_PositionEmployee() {
    }

    public EP_PositionEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
