package com.example.fileSharing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.fileSharing.model.SampleFile;
import com.example.fileSharing.repository.UserRepo;

@RestController
@RequestMapping("/")
public class FileSharingController {
	@Autowired
    private UserRepo userrep;

	@PostMapping("/register")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void register(@RequestBody SampleFile user) {
		
	}

}
