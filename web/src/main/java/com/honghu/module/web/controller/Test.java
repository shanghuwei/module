package com.honghu.module.web.controller;

import com.honghu.module.entity.User;
import com.honghu.module.sevice.myservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Test {
    @Autowired
    myservice myservice;

    @GetMapping("/getString")
    public List<User> GetString(){
        return myservice.GetString();
    }
}
