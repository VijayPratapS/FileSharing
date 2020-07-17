package com.example.fileSharing.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name="ShareDetails")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ShareDetails {
    @Id
    private String userid;
    private String fileId;
}

