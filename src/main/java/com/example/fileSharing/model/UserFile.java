package com.example.fileSharing.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.*;

import java.util.List;

import static javax.persistence.CascadeType.ALL;

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
