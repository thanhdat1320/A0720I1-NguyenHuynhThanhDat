package model;

public class SV_TypeService {
    private int id;
    private String name;

    public SV_TypeService() {
    }

    public SV_TypeService(int id, String name) {
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
