package com.example.codeid.backendtest.dao;

import com.example.codeid.backendtest.domain.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReportDAO extends JpaRepository<Report, Integer> {

    @Query(value = "SELECT * FROM REPORT WHERE USER_ID = ?1 DESC", nativeQuery = true)
    List<Report> getLatestReport(Integer userId);
}
