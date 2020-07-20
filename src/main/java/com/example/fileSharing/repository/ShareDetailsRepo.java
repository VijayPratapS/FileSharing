package com.example.fileSharing.repository;

import com.example.fileSharing.model.ShareDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShareDetailsRepo extends JpaRepository<ShareDetails, String> {
}
