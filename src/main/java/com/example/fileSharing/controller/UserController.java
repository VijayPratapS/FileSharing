package com.example.fileSharing.controller;

import com.example.fileSharing.Service.UserService;
import com.example.fileSharing.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
@Autowired
    private UserService userService;
    @PostMapping(value = "/register" , consumes = {"application/JSON"})
    public void register(@RequestBody User user) {
         userService.register(user);
    }

}
