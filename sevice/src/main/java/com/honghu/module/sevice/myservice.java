package com.honghu.module.sevice;

import com.honghu.module.entity.User;
import com.honghu.module.repo.MyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class myservice {

    @Autowired
    MyRepo myRepo;

    public List<User> GetString (){

        return myRepo.findAll();
    }
}
