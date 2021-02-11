package com.example.codeid.backendtest.controller;

import com.example.codeid.backendtest.dto.AttendanceDTO;
import com.example.codeid.backendtest.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AttendanceController {

    @Autowired
    AttendanceService attendanceService;

    @PostMapping("hrms/makeNewAttendance")
    public ResponseEntity<?> makeNewAttendance(@RequestBody AttendanceDTO attendanceDTO){

        if(attendanceDTO != null){
            return new ResponseEntity<>(attendanceService.insertNewAttendance(attendanceDTO), HttpStatus.OK);
        }
        return new ResponseEntity<>("Please insert the right data!", HttpStatus.BAD_REQUEST);

    }

    @GetMapping("hrms/getAllAttendance")
    public ResponseEntity<?> getAllAttendance(){

        try {
            return new ResponseEntity<>(attendanceService.getAllAttendance(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>("There's no attendance!", HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("hrms/getAttendanceById/{id}")
    public ResponseEntity<?> getAttendanceById(@PathVariable Integer id){

        if(id != null){
            return new ResponseEntity<>(attendanceService.getAttendanceById(id), HttpStatus.OK);
        }
        return new ResponseEntity<>("There's no attendance on the id!", HttpStatus.NOT_FOUND);
    }

}
