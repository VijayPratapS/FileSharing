package com.example.fileSharing.controller;

import com.example.fileSharing.Service.FileService;
import com.example.fileSharing.Service.ShareService;
import com.example.fileSharing.model.File;
import com.example.fileSharing.model.ShareDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController

public class FileSharingController {
    @Autowired
    private FileService service;
    @Autowired
    private ShareService shareService;


    @GetMapping("/api/file/{id}")
    public ResponseEntity<File> getFileById(@PathVariable(name = "id") String id) {
        return service.getFileById(id);
    }

    @GetMapping("/api/file")
    public List<File> getFile() {
        return service.getFile();
    }

    @PostMapping(value = "/api/file")
    public void fileUpload(@RequestParam(value = "file") MultipartFile file) throws IllegalStateException, IOException {
        service.fileUpload(file);
        //use multipart file for uplodaing file data

    }

    @PostMapping(value = "/api/share")
    public void share(@RequestBody ShareDetails shareDetails) {
        shareService.share(shareDetails);
    }
}