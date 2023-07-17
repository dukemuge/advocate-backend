package com.advocate.diary.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "client")
@Getter
@Setter
@NoArgsConstructor
public class Client {
    private String  id;
    private  String mobileNo;
    private String name;
    private  String postalCode;
    private String occupation;
    private String nationalId;
    private  String email;
    private List<Case> cases;


}