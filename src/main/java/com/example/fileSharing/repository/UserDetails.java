package com.example.fileSharing.repository;

import com.example.fileSharing.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetails extends JpaRepository<User,String> {
}
