package com.example.demo.controller;

import com.example.demo.dao.UserService;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService = null;

    @RequestMapping("/print")
    @ResponseBody
    public User pintUser(Long id,String userName,String note){
        User user = new User(id,userName,note);
        userService.printUser(user);
        return user;
    }

}
