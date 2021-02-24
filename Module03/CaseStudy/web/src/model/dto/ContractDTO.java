package model.dto;

public class ContractDTO {
    private int id;
    private String start_date;
    private String end_date;
    private int id_services;
    private int id_customer;
    private int id_employee;
    private String nameService;
    private String nameCustomer;
    private String nameEmployee;

    public ContractDTO() {
    }

    public ContractDTO(int id, String start_date, String end_date, int id_services, int id_customer, int id_employee, String nameService, String nameCustomer, String nameEmployee) {
        this.id = id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.id_services = id_services;
        this.id_customer = id_customer;
        this.id_employee = id_employee;
        this.nameService = nameService;
        this.nameCustomer = nameCustomer;
        this.nameEmployee = nameEmployee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public int getId_services() {
        return id_services;
    }

    public void setId_services(int id_services) {
        this.id_services = id_services;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public int getId_employee() {
        return id_employee;
    }

    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }
}
