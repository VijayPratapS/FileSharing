package com.example.fileSharing.Service;

import com.example.fileSharing.model.File;
import com.example.fileSharing.repository.FileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FileService {

    @Autowired
    private FileRepo fileRepo;


    public List<File> getFile() {
        List<File> list = new ArrayList<>();
        fileRepo.findAll().forEach(list::add);
        return list;
    }

    public ResponseEntity<File> getFileById(String id) {
        Optional<File> optional = fileRepo.findById(id);

        if (optional.isPresent()) {
            File file = fileRepo.getOne(id);
            return new ResponseEntity<>(file, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);


    }

    public ResponseEntity<Object> fileUpload(MultipartFile file)
    {

        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
             LocalDateTime now = LocalDateTime.now();
             
            String filename = StringUtils.cleanPath(dtf.format(now) + "  " + file.getOriginalFilename());
            if (filename.contains("..")) {
                throw new RuntimeException("Sorry! Filename contains invalid path sequence " + filename);
            }
            file.transferTo(new java.io.File("D:\\FileTest\\" + filename));
            File fileEntity = new File();
            fileEntity.setFileName(filename);
            fileEntity.setFileType(file.getContentType());
            fileEntity.setOwned(true);
            File uploadedFile = fileRepo.save(fileEntity);
            return new ResponseEntity<>("Successfully uploaded the file with id: " + uploadedFile.getId(),
                    HttpStatus.OK);
        } catch (IOException ex) {

            return new ResponseEntity<>("Could not store file. Please try again! " + ex,
                    HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (Exception e) {
            return new ResponseEntity<>("Internal server error. " + e.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}

