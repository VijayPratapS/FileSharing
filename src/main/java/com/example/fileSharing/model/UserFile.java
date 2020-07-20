package com.example.fileSharing.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userfile")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class UserFile {
    @Id
    private String fileId;
    private String message;

}
