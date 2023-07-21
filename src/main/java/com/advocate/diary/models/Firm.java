package com.advocate.diary.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "firms")
@Getter
@Setter
@NoArgsConstructor
public class Firm {
    @Id
    @Column(name = "firm_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "logo")
    private String logo;

    @Column(name = "license_no")
    private String licenseNo;

    @Column(name = "operating_license")
    private String operatingLicense;

    @Column(name = "location")
    private String location ;

    @Column(name = "email")
    private String email;

    @Column(name = "contact_No")
    private String  contactNo;

    @Column(name = "county")
    private String county;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "firm")
    private List<LegalService> legalServices;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "firm")
    private List<Lawyer>  lawyers;

    @Column(name = "date_of_incorporation")
    private LocalDate dateOfIncorporation;

    @Column(name = "date_of_creation")
    private LocalDate creationDate;

    @Column(name = "date_of_edit")
    private LocalDate editDate;

}
