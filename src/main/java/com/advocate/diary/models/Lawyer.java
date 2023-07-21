package com.advocate.diary.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "lawyers")
@Getter
@Setter
@NoArgsConstructor
public class Lawyer {
    private String  id;
    private  String mobileNo;
    private String name;
    private String universityName;
    private  String postalCode;
    private String occupation;
    private String nationalId;
    private  String email;
    private String accreditationNo;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "lawyer")
    private List<Case> cases;
    @ManyToOne
    private Firm firm;

    //TODO: Many to many  with Lawyer ..i will check and implement  do the Implementation
//    private List<Competency> competencies;

}
