package com.example.fileSharing.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "userfile")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SampleFile{
	        @Id
	         private String EmailId;
	         private String password;
	        private String name;
	        private String Message;

	        
}
