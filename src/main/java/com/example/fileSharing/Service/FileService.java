package com.example.fileSharing.Service;

import com.example.fileSharing.model.UserFile;
import com.example.fileSharing.repository.UserFileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class FileService {

    @Autowired
    private UserFileRepo fileRepo;


    public List<UserFile> getFile() {
        List<UserFile> list = new ArrayList<>();
        fileRepo.findAll().forEach(list::add);
        return list;
    }

    public ResponseEntity<UserFile> getFileById(String id) {
        Optional<UserFile> optional = fileRepo.findById(id);

        if (optional.isPresent()) {
            UserFile file = fileRepo.getOne(id);
            return new ResponseEntity<>(file, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);


    }

    public void fileUpload(MultipartFile file) throws IOException {

        file.transferTo(new File("D:\\FileTest\\" + file.getOriginalFilename()));
    }
}
