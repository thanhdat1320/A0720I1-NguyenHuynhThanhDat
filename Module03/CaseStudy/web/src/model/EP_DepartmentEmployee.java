package model;

public class EP_DepartmentEmployee {
    private int id;
    private String name;

    public EP_DepartmentEmployee() {
    }

    public EP_DepartmentEmployee(int id, String name) {
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
