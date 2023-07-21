package com.advocate.diary.models;

import jakarta.persistence.*;
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
    @Id
    @Column(name = "client_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  id;

    @Column(name = "mobile_no")
    private  String mobileNo;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "postal_code")
    private  String postalCode;

    @Column(name = "occupation")
    private String occupation;

    @Column(name = "national_id")
    private String nationalId;

    @Column(name = "email")
    private  String email;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "client")
    private List<Case> cases;


}