package com.example.codeid.backendtest.dao;

import com.example.codeid.backendtest.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersDAO extends JpaRepository<Users, Integer> {
}
