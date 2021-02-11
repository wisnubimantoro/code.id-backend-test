package com.example.codeid.backendtest.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@ApiModel(description = "All details about reporting")
@Entity
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REPORT_SEQ")
    @Column(name = "id")
    private Integer id;

    @ApiModelProperty(notes = "Id of the user")
    @NotNull(message = "user_id cannot be null!")
    @Column(name = "user_id")
    private Integer user_id;

    @ApiModelProperty(notes = "Last absent of the user")
    @Column(name = "last_absent_date")
    private Date last_absent_date;

    @ApiModelProperty(notes = "Average absent time of the user")
    @Column(name = "average_absent_time")
    private Double agerage_absent_time;

    public Report() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Date getLast_absent_date() {
        return last_absent_date;
    }

    public void setLast_absent_date(Date last_absent_date) {
        this.last_absent_date = last_absent_date;
    }

    public Double getAgerage_absent_time() {
        return agerage_absent_time;
    }

    public void setAgerage_absent_time(Double agerage_absent_time) {
        this.agerage_absent_time = agerage_absent_time;
    }
}
