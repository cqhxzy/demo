package com.example.demo.dao.impl;

import com.example.demo.dao.UserService;
import com.example.demo.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Override
    public void printUser(User user) {
        if (null == user){
            throw new RuntimeException("参数user为null");
        }
        System.out.println(user);

    }
}
