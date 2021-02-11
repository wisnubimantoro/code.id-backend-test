package com.example.codeid.backendtest.controller;

import com.example.codeid.backendtest.dto.UsersDTO;
import com.example.codeid.backendtest.response.GetUsersByIdResponse;
import com.example.codeid.backendtest.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {

    @Autowired
    UsersService usersService;

    @PostMapping("hrms/insertUser")
    public ResponseEntity<?> insertUser(@RequestBody UsersDTO usersDTO){

        if(usersDTO != null){
            return new ResponseEntity(usersService.insertNewUser(usersDTO), HttpStatus.OK);
        }
        return new ResponseEntity<>("Please insert all data!", HttpStatus.BAD_REQUEST);
    }

    @GetMapping("hrms/getAllUsers")
    public ResponseEntity<?> getAllUsers(){

        try {
            return new ResponseEntity<>(usersService.getAllUsers(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>("There's no data!", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("hrms/getUser/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Integer id){

        GetUsersByIdResponse response = usersService.getUsersById(id);

        if (response != null) {
            return new ResponseEntity<>(response, HttpStatus.OK);
        }else {
            return new ResponseEntity<>("There's no user with the id!", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("hrms/updateUser/{id}")
    public ResponseEntity<?> updateUserById(@PathVariable Integer id, @RequestBody UsersDTO usersDTO){

        if( id != null && usersDTO != null){
            return new ResponseEntity<>(usersService.updateUsersById(id, usersDTO), HttpStatus.OK);
        }
        if (usersDTO == null) {
            return new ResponseEntity<>("Please update at least 1 data!", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Cannot find the user!", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("hrms/delete/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable Integer id){

        if(id != null){
            return new ResponseEntity<>(usersService.deleteUsersById(id), HttpStatus.OK);
        }
        return new ResponseEntity<>("User not found!", HttpStatus.NOT_FOUND);
    }
}
