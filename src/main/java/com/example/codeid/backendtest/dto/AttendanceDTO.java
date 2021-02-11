package com.example.codeid.backendtest.dto;

import java.util.Date;

public class AttendanceDTO {

    public Integer user_id;
    public Date absent_time;
    public Date absend_date;

    public AttendanceDTO(Integer user_id, Date absent_time, Date absend_date) {
        this.user_id = user_id;
        this.absent_time = absent_time;
        this.absend_date = absend_date;
    }

    public AttendanceDTO() {
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Date getAbsent_time() {
        return absent_time;
    }

    public void setAbsent_time(Date absent_time) {
        this.absent_time = absent_time;
    }

    public Date getAbsend_date() {
        return absend_date;
    }

    public void setAbsend_date(Date absend_date) {
        this.absend_date = absend_date;
    }
}
