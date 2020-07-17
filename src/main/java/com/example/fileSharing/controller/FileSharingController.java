package com.example.fileSharing.controller;

import java.util.List;

import com.example.fileSharing.Service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fileSharing.model.UserFile;

@RestController
@RequestMapping
public class FileSharingController {
	@Autowired
	private FileService service;

	@GetMapping("/api/file/{id}")
	public ResponseEntity<UserFile> getFileById(@PathVariable(name = "id") String id) {
		return service.getFileById(id);
	}

	@GetMapping("/api/file")
	public List<UserFile> getFile() {
		return service.getFile();
	}
	@PostMapping(value = "/api/file",consumes = {"application/json"})
	public void fileUpload(@RequestBody UserFile file)
	{
		service.fileUpload(file);
	}
}

