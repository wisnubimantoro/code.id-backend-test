package com.example.codeid.backendtest.service;

import com.example.codeid.backendtest.domain.Users;
import com.example.codeid.backendtest.dto.UsersDTO;
import com.example.codeid.backendtest.response.GetUsersByIdResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsersService {
    Users insertNewUser(UsersDTO usersDTO);

    List<Users> getAllUsers();

    GetUsersByIdResponse getUsersById(Integer id);

    Users updateUsersById(Integer id, UsersDTO usersDTO);

    String deleteUsersById(Integer id);
}
