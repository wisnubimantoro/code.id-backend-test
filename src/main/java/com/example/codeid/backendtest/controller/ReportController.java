package com.example.codeid.backendtest.controller;

import com.example.codeid.backendtest.dto.ReportDTO;
import com.example.codeid.backendtest.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {

    @Autowired
    ReportService reportService;

    @PostMapping("hrms/makeReport")
    public ResponseEntity<?> makeNewReport(@RequestBody ReportDTO reportDTO){

        if(reportDTO != null){
            return new ResponseEntity<>(reportService.makeReporting(reportDTO), HttpStatus.OK);
        }
        return new ResponseEntity<>("Cannot make reporting!", HttpStatus.BAD_REQUEST);

    }

    @GetMapping("hrms/getAllReports")
    public ResponseEntity<?> getAllReports(){

        try {
            return new ResponseEntity<>(reportService.getAllReport(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>("There's no reporting!", HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("hrms/getLatestReport")
    public ResponseEntity<?> getLatestReport(Integer userId){

        if(userId != null){
            return new ResponseEntity<>(reportService.getLatestReport(userId), HttpStatus.OK);
        }
        return new ResponseEntity<>("There's no report on the user!", HttpStatus.NOT_FOUND);
    }

}
