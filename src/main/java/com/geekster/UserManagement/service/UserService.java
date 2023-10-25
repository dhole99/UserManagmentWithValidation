package com.geekster.UserManagement.service;

import com.geekster.UserManagement.model.User;
import com.geekster.UserManagement.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;



    public String addUser(User myUser) {
        userRepo.getUserMap().put(myUser.getUserId(),myUser);
        return "Added";
    }

    public Map<Integer, User> getAllusers() {
        return userRepo.getUserMap();
    }

}
