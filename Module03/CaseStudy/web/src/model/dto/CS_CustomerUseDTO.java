package model.dto;

public class CS_CustomerUseDTO {
    private int id;
    private String name;
    private int idTypeCustomer;
    private String nameTypeCustomer;
    private String nameServiceInclude;

    public CS_CustomerUseDTO() {
    }

    public CS_CustomerUseDTO(int id, String name, int idTypeCustomer, String nameTypeCustomer, String nameServiceInclude) {
        this.id = id;
        this.name = name;
        this.idTypeCustomer = idTypeCustomer;
        this.nameTypeCustomer = nameTypeCustomer;
        this.nameServiceInclude = nameServiceInclude;
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

    public int getIdTypeCustomer() {
        return idTypeCustomer;
    }

    public void setIdTypeCustomer(int idTypeCustomer) {
        this.idTypeCustomer = idTypeCustomer;
    }

    public String getNameTypeCustomer() {
        return nameTypeCustomer;
    }

    public void setNameTypeCustomer(String nameTypeCustomer) {
        this.nameTypeCustomer = nameTypeCustomer;
    }

    public String getNameServiceInclude() {
        return nameServiceInclude;
    }

    public void setNameServiceInclude(String nameServiceInclude) {
        this.nameServiceInclude = nameServiceInclude;
    }
}
