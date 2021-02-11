package com.example.codeid.backendtest.service.impl;

import com.example.codeid.backendtest.dao.UsersDAO;
import com.example.codeid.backendtest.domain.Users;
import com.example.codeid.backendtest.dto.UsersDTO;
import com.example.codeid.backendtest.response.GetUsersByIdResponse;
import com.example.codeid.backendtest.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersDAO usersDAO;

    @Override
    public Users insertNewUser(UsersDTO usersDTO){

        Users users = new Users();

        users.setName(usersDTO.getName());
        users.setAddress(usersDTO.getAddress());
        if(usersDTO.getGender().equals("M")){
            users.setGender("Male");
        }if(usersDTO.getGender().equals("F")){
            users.setGender("Female");
        }
        if(usersDTO.getPosition().equals(1)){
            users.setPosition("Manager");
        }
        if(usersDTO.getPosition().equals(2)){
            users.setPosition("Staff");
        }
        if(usersDTO.getPosition().equals(3)){
            users.setPosition("Programmer");
        }
        users.setSalary(usersDTO.getSalary());

        usersDAO.save(users);

        return users;
    }

    @Override
    public List<Users> getAllUsers(){
        return usersDAO.findAll();
    }

    @Override
    public GetUsersByIdResponse getUsersById(Integer id){

        Users users = usersDAO.getOne(id);

        GetUsersByIdResponse getUsersByIdResponse = new GetUsersByIdResponse();

        getUsersByIdResponse.setId(users.getId());
        getUsersByIdResponse.setName(users.getName());
        getUsersByIdResponse.setAddress(users.getAddress());
        getUsersByIdResponse.setGender(users.getGender());
        getUsersByIdResponse.setPosition(users.getPosition());
        getUsersByIdResponse.setSalary(users.getSalary());

        return getUsersByIdResponse;
    }

    @Override
    public Users updateUsersById(Integer id, UsersDTO usersDTO){

        Users users = usersDAO.getOne(id);

        if(usersDTO.getName() != null) {
            users.setName(usersDTO.getName());
        }
        if(usersDTO.getAddress() != null) {
            users.setAddress(usersDTO.getAddress());
        }
        if(usersDTO.getPosition() != null) {
            users.setPosition(usersDTO.getPosition());
        }
        if(usersDTO.getSalary() != null) {
            users.setSalary(usersDTO.getSalary());
        }

        usersDAO.save(users);

        return users;
    }

    @Override
    public String deleteUsersById(Integer id){

        usersDAO.deleteById(id);

        return "Users with id " + id + "has been deleted!";
    }
}
