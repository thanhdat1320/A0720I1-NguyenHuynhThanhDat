package model.dto;

public class ServiceDTO {
    private int id;
    private String name;
    private int idTypeService;
    private String nameTypeService;
    private int idTypeRent;
    private String nameTypeRent;
    private String status;

    public ServiceDTO() {
    }

    public ServiceDTO(int id, String name, int idTypeService, String nameTypeService, int idTypeRent, String nameTypeRent, String status) {
        this.id = id;
        this.name = name;
        this.idTypeService = idTypeService;
        this.nameTypeService = nameTypeService;
        this.idTypeRent = idTypeRent;
        this.nameTypeRent = nameTypeRent;
        this.status = status;
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

    public int getIdTypeService() {
        return idTypeService;
    }

    public void setIdTypeService(int idTypeService) {
        this.idTypeService = idTypeService;
    }

    public String getNameTypeService() {
        return nameTypeService;
    }

    public void setNameTypeService(String nameTypeService) {
        this.nameTypeService = nameTypeService;
    }

    public int getIdTypeRent() {
        return idTypeRent;
    }

    public void setIdTypeRent(int idTypeRent) {
        this.idTypeRent = idTypeRent;
    }

    public String getNameTypeRent() {
        return nameTypeRent;
    }

    public void setNameTypeRent(String nameTypeRent) {
        this.nameTypeRent = nameTypeRent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
