package com.example.codeid.backendtest.service.impl;

import com.example.codeid.backendtest.dao.AttendanceDAO;
import com.example.codeid.backendtest.domain.Attendance;
import com.example.codeid.backendtest.dto.AttendanceDTO;
import com.example.codeid.backendtest.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    AttendanceDAO attendanceDAO;

    @Override
    public Attendance insertNewAttendance(AttendanceDTO attendanceDTO){

        Attendance attendance = new Attendance();

        attendance.setUser_id(attendanceDTO.getUser_id());
        List<Attendance> attendances = attendanceDAO.findAll();
        for(int i = 0 ; i<attendances.size() ; i++){
            if(!attendanceDTO.getAbsend_date().equals(attendances.get(i))){
                attendance.setAbsent_date(attendanceDTO.getAbsend_date());
            }else {
                return null;
            }
        }
        attendance.setAbsent_time(attendanceDTO.getAbsent_time());

        attendanceDAO.save(attendance);

        return attendance;
    }

    @Override
    public List<Attendance> getAllAttendance(){

        return attendanceDAO.findAll();
    }

    @Override
    public List<Attendance> getAttendanceById(Integer id){

        return attendanceDAO.findByUserId(id);
    }
}
