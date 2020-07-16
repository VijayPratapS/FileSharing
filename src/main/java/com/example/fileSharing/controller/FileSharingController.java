package com.example.fileSharing.controller;

import java.util.List;

import com.example.fileSharing.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.fileSharing.model.SampleFile;

@RestController
@RequestMapping
public class FileSharingController {
	@Autowired
	private UserService service;

	@PostMapping(value = "/register" , consumes = {"application/JSON"})
	public void register(@RequestBody SampleFile user) {
		service.register(user);
	}


	@GetMapping("/api/file/{id}")
	public ResponseEntity<SampleFile> getFileById(@PathVariable(name = "id") String id) {
		return service.getFileById(id);
	}

	@GetMapping("/api/file")
	public List<SampleFile> getFile() {
		return service.getFile();
	}
}

