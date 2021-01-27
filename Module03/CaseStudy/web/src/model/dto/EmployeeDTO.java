package model.dto;

public class EmployeeDTO {
    private int id;
    private int idDepartment;
    private int idPosition;
    private int idLevel;
    private String name;
    private String namePosition;
    private String nameDepartment;
    private String nameLevel;

    public EmployeeDTO() {
    }

    public EmployeeDTO(int id, int idDepartment, int idPosition, int idLevel, String name, String namePosition, String nameDepartment, String nameLevel) {
        this.id = id;
        this.idDepartment = idDepartment;
        this.idPosition = idPosition;
        this.idLevel = idLevel;
        this.name = name;
        this.namePosition = namePosition;
        this.nameDepartment = nameDepartment;
        this.nameLevel = nameLevel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(int idDepartment) {
        this.idDepartment = idDepartment;
    }

    public int getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(int idPosition) {
        this.idPosition = idPosition;
    }

    public int getIdLevel() {
        return idLevel;
    }

    public void setIdLevel(int idLevel) {
        this.idLevel = idLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePosition() {
        return namePosition;
    }

    public void setNamePosition(String namePosition) {
        this.namePosition = namePosition;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public String getNameLevel() {
        return nameLevel;
    }

    public void setNameLevel(String nameLevel) {
        this.nameLevel = nameLevel;
    }
}
