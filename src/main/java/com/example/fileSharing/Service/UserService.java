package com.example.fileSharing.Service;

import com.example.fileSharing.model.User;
import com.example.fileSharing.model.UserFile;
import com.example.fileSharing.repository.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
@Autowired
    private UserDetails userDetails;
    public void register(User user) {
        userDetails.save(user);
    }
}
