package model;

public class EP_Employee {
    private int id;
    private int idLevelEmployee;
    private int idPositionEmployee;
    private int idDepartmentEmployee;
    private String name;
    private String birthday;
    private String identity;
    private String phoneNumber;
    private String email;
    private String salary;

    public EP_Employee() {
    }

    public EP_Employee(int id, int idLevelEmployee, int idPositionEmployee, int idDepartmentEmployee, String name, String birthday, String identity, String phoneNumber, String email, String salary) {
        this.id = id;
        this.idLevelEmployee = idLevelEmployee;
        this.idPositionEmployee = idPositionEmployee;
        this.idDepartmentEmployee = idDepartmentEmployee;
        this.name = name;
        this.birthday = birthday;
        this.identity = identity;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdLevelEmployee() {
        return idLevelEmployee;
    }

    public void setIdLevelEmployee(int idLevelEmployee) {
        this.idLevelEmployee = idLevelEmployee;
    }

    public int getIdPositionEmployee() {
        return idPositionEmployee;
    }

    public void setIdPositionEmployee(int idPositionEmployee) {
        this.idPositionEmployee = idPositionEmployee;
    }

    public int getIdDepartmentEmployee() {
        return idDepartmentEmployee;
    }

    public void setIdDepartmentEmployee(int idDepartmentEmployee) {
        this.idDepartmentEmployee = idDepartmentEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
