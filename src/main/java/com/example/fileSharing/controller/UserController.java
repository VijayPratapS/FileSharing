package com.example.fileSharing.controller;

import com.example.fileSharing.Service.ShareService;
import com.example.fileSharing.Service.UserService;
import com.example.fileSharing.model.ShareDetails;
import com.example.fileSharing.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
@Autowired
    private UserService userService;
@Autowired
private ShareService shareService;
    @PostMapping(value = "/register" , consumes = {"application/json"})
    public void register(@RequestBody User user) {
         userService.register(user);
    }
    @PostMapping(value = "/api/share",consumes = {"application/json"})
    public void share(@RequestBody ShareDetails shareDetails)
    {
        shareService.share(shareDetails);
    }
}
