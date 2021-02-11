package com.example.codeid.backendtest.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.util.Date;

@ApiModel(description = "All details about Attendance")
@Entity
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ATTENDANCE_SEQ")
    @Column(name = "id")
    private Integer id;

    @ApiModelProperty(notes = "Id of the user")
    @Column(name = "user_id")
    private Integer user_id;

    @PastOrPresent
    @ApiModelProperty(notes = "absent time must be present")
    @NotNull(message = "Attendance must be once in a day!")
    @Column(name = "absent_time")
    private Date absent_time;

    @PastOrPresent
    @ApiModelProperty(notes = "absent date must be present")
    @Column(name = "absent_date")
    private Date absent_date;

    public Attendance() {
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

    @JsonFormat(pattern = "HH:mm")
    public Date getAbsent_time() {
        return absent_time;
    }
    @JsonFormat(pattern = "HH:mm")
    public void setAbsent_time(Date absent_time) {
        this.absent_time = absent_time;
    }

    @JsonFormat(pattern = "dd-MMMM-yyyy")
    public Date getAbsent_date() {
        return absent_date;
    }
    @JsonFormat(pattern = "dd-MMMM-yyyy")
    public void setAbsent_date(Date absent_date) {
        this.absent_date = absent_date;
    }

}
