package models;

import java.util.Date;

public class Customer {
    private String name;
    private Date birthday;
    private String address;
    private String photo;

    public Customer() {
    }

    public Customer(String name, Date birthday, String address, String photo) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
