package com.example.fileSharing.repository;

import com.example.fileSharing.model.UserFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserFileRepo extends JpaRepository<UserFile, String> {

}
