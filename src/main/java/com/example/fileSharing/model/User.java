package com.example.fileSharing.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name="User")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String userid;
    private String password;
    @OneToMany(cascade = ALL)
    @JoinColumn(name = "uid" ,referencedColumnName ="userid")
    private List<UserFile> fileList;

}
