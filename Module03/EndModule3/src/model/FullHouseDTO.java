package model;

public class FullHouseDTO {
    private String id;
    private String name;
    private String phone;
    private String start;
    private String note;
    private String nameCost;
    private String idCost;

    public FullHouseDTO() {
    }

    public FullHouseDTO(String id, String name, String phone, String start, String note, String nameCost, String idCost) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.start = start;
        this.note = note;
        this.nameCost = nameCost;
        this.idCost = idCost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNameCost() {
        return nameCost;
    }

    public void setNameCost(String nameCost) {
        this.nameCost = nameCost;
    }

    public String getIdCost() {
        return idCost;
    }

    public void setIdCost(String idCost) {
        this.idCost = idCost;
    }
}
