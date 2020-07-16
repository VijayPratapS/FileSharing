package com.example.fileSharing.Service;

import com.example.fileSharing.model.SampleFile;
import com.example.fileSharing.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class UserService {

    @Autowired
    private UserRepo userrep;

    public void register(SampleFile user) {
        userrep.save(user);
    }

    public List<SampleFile> getFile() {
        List<SampleFile> list = new ArrayList<>();
        userrep.findAll().forEach(list::add);
        return list;
    }

    public ResponseEntity<SampleFile> getFileById(String id) {
        Optional<SampleFile> optional = userrep.findById(id);

        if (optional.isPresent()) {
            SampleFile file = userrep.getOne(id);
            return new ResponseEntity<>(file, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);


    }
}
