package com.example.fileSharing.Service;
import com.example.fileSharing.model.ShareDetails;
import com.example.fileSharing.repository.ShareDet;
import org.springframework.beans.factory.annotation.Autowired;

public class ShareService {
    @Autowired
    private ShareDet Details;
    public void share(ShareDetails shar)
    {
        Details.save(shar);
    }

}
