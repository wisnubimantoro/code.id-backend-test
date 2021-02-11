package com.example.codeid.backendtest.service.impl;

import com.example.codeid.backendtest.dao.AttendanceDAO;
import com.example.codeid.backendtest.dao.ReportDAO;
import com.example.codeid.backendtest.domain.Report;
import com.example.codeid.backendtest.dto.ReportDTO;
import com.example.codeid.backendtest.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    ReportDAO reportDAO;

    @Autowired
    AttendanceDAO attendanceDAO;

    @Override
    public Report makeReporting(ReportDTO reportDTO){

        Report report = new Report();

        report.setUser_id(reportDTO.getUser_id());

        report.setLast_absent_date(attendanceDAO.findByUserId(reportDTO.getUser_id()).get(0).getAbsent_date());
        report.setAgerage_absent_time(attendanceDAO.searchAvgAttendance());

        reportDAO.save(report);

        return report;
    }

    @Override
    public List<Report> getAllReport(){
        return reportDAO.findAll();
    }

    @Override
    public Report getLatestReport(Integer userId){

        List<Report> reports = reportDAO.getLatestReport(userId);

        Report report = reports.get(0);

        return report;
    }
}
