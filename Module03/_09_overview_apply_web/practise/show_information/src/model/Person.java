package model;

import java.util.Date;

public class Person {
    private String name;
    private String address;
    private Date birthday;

    public Person() {
    }

    public Person(String name, String address, Date birthday) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        Date currentDay = new Date();
        return currentDay.getYear() - this.birthday.getYear() + 1;
    }

    public String showBirthday() {
        return birthday.toString();
    }
}
