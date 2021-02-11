package com.example.codeid.backendtest.service;

import com.example.codeid.backendtest.domain.Report;
import com.example.codeid.backendtest.dto.ReportDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReportService {
    Report makeReporting(ReportDTO reportDTO);

    List<Report> getAllReport();

    Report getLatestReport(Integer userId);
}
