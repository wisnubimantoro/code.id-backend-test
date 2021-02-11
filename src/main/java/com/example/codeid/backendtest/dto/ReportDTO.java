package com.example.codeid.backendtest.dto;

import java.util.Date;

public class ReportDTO {

    private Integer user_id;
    private Date last_absent_date;
    private Double agerage_absent_time;

    public ReportDTO(Integer user_id, Date last_absent_date, Double agerage_absent_time) {
        this.user_id = user_id;
        this.last_absent_date = last_absent_date;
        this.agerage_absent_time = agerage_absent_time;
    }

    public ReportDTO() {
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
