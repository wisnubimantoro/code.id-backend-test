package com.example.codeid.backendtest.dto;

public class UsersDTO {

    private String name;
    private String address;
    private String gender;
    private String position;
    private Integer salary;

    public UsersDTO(String name, String address, String gender, String position, Integer salary) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.position = position;
        this.salary = salary;
    }

    public UsersDTO() {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
