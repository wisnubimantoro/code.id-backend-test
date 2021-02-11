package com.example.codeid.backendtest.service;

import com.example.codeid.backendtest.domain.Attendance;
import com.example.codeid.backendtest.dto.AttendanceDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AttendanceService {
    Attendance insertNewAttendance(AttendanceDTO attendanceDTO);

    List<Attendance> getAllAttendance();

    List<Attendance> getAttendanceById(Integer id);
}
