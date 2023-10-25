package com.geekster.UserManagement;

import com.geekster.UserManagement.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataSource {


    @Bean
    Map<Integer, User> getUsersource(){

        return new HashMap<>();
    }
}

