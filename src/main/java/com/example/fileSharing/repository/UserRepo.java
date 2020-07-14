package com.example.fileSharing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fileSharing.model.SampleFile;
@Repository
public interface UserRepo extends JpaRepository<SampleFile, String> {

}
