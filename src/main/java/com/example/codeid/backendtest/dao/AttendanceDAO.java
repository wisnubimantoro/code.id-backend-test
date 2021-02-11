package com.example.codeid.backendtest.dao;

import com.example.codeid.backendtest.domain.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttendanceDAO extends JpaRepository<Attendance, Integer> {

    @Query(value = "SELECT * FROM ATTENDANCE WHERE USER_ID = ?1 ORDER BY ABSENT_DATE DESC", nativeQuery = true)
    List<Attendance> findByUserId(Integer id);

    @Query(value = "SELECT CAST(AVG(CAST(ABSENT_DATE AS FLOAT)) AS DATE)", nativeQuery = true)
    Double searchAvgAttendance();
}
