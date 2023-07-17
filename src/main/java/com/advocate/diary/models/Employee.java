package com.advocate.diary.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "posts")
@Getter
@Setter
@NoArgsConstructor
public class Employee {
    private long id;
    private  String  fullName;
    private String  profilePic;
    private LocalDateTime createdAt;
    private String lawyerId;
    private String  phoneNo;
    private String universityName;
    private String experience;
    private List<Competency> competencies;

}
