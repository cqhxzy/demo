package com.example.demo.dao;

import com.example.demo.domain.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {
    void printUser(User user);
}
