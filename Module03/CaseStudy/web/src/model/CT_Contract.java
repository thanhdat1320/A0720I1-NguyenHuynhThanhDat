package model;

public class CT_Contract {
    private int id;
    private int idServices;
    private int idCustomer;
    private int idEmployee;
    private String start;
    private String end;
    private int deposit;
    private int total;

    public CT_Contract() {
    }

    public CT_Contract(int id, int idServices, int idCustomer, int idEmployee, String start, String end, int deposit, int total) {
        this.id = id;
        this.idServices = idServices;
        this.idCustomer = idCustomer;
        this.idEmployee = idEmployee;
        this.start = start;
        this.end = end;
        this.deposit = deposit;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdServices() {
        return idServices;
    }

    public void setIdServices(int idServices) {
        this.idServices = idServices;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
