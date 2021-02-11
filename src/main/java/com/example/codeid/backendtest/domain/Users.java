package com.example.codeid.backendtest.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@ApiModel(description = "All details about the users")
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USERS_SEQ")
    @Column(name = "id")
    private Integer id;

    @Size(min = 4, message = "Name must have at least 4 characters!")
    @ApiModelProperty(notes = "Name must have at least 4 characters!")
    @Column(name = "name")
    private String name;

    @Size(min = 10, message = "Address must have at least 10 characters!")
    @ApiModelProperty(notes = "Address must have at least 10 characters!")
    @Column(name = "address")
    private String address;

    @ApiModelProperty(notes = "Gender must be 'M' or 'F'!")
    @Column(name = "gender")
    private String gender;

    @ApiModelProperty(notes = "Position must be 1 or 2 or 3 or 4 or 5")
    @Column(name = "position")
    private String position;

    @ApiModelProperty(notes = "User's salary")
    @Column(name = "salary")
    private Integer salary;

    public Users() {
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
