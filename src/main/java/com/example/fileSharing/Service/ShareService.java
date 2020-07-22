package com.example.fileSharing.Service;
import com.example.fileSharing.model.ShareDetails;
import com.example.fileSharing.model.User;
import com.example.fileSharing.repository.ShareDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShareService {
    @Autowired
    private ShareDetailsRepo Details;
    public void share(ShareDetails shareAccess)
    {
        Details.save(shareAccess);
    }

}
