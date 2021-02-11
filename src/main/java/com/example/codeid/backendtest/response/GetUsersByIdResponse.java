package com.example.codeid.backendtest.response;

public class GetUsersByIdResponse {

    private Integer id;
    private String name;
    private String address;
    private String gender;
    private String position;
    private Integer salary;

    public GetUsersByIdResponse(Integer id, String name, String address, String gender, String position, Integer salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.position = position;
        this.salary = salary;
    }

    public GetUsersByIdResponse() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
