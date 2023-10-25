package com.geekster.UserManagement.controller;

import com.geekster.UserManagement.model.User;
import com.geekster.UserManagement.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Validated
public class UserController {
    @Autowired
    UserService userService;


    @PostMapping("user")
    public String addUser(@RequestBody @Valid User myUser){
        return userService.addUser(myUser);
    }
    @GetMapping("users")
    public Map<Integer,User> getAllusers(){

        return userService.getAllusers();
    }


}
