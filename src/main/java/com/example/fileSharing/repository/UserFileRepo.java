package com.example.fileSharing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fileSharing.model.UserFile;
@Repository
public interface UserFileRepo extends JpaRepository<UserFile, String> {

}
