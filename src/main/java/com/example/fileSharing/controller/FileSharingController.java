package com.example.fileSharing.controller;

import java.io.IOException;
import java.util.List;

import com.example.fileSharing.Service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.fileSharing.model.UserFile;
import org.springframework.web.multipart.MultipartFile;

@RestController

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

    @PostMapping(value = "/api/file", consumes = {"application/json"})
    public void fileUpload(@RequestParam(value = "file") MultipartFile file) throws IOException {
        service.fileUpload(file);
        //use multipart file for uplodaing file data

    }
}