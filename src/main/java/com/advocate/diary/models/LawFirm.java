package com.advocate.diary.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "law_firm")
@Getter
@Setter
@NoArgsConstructor
public class LawFirm {
    private long id;
    private String name;
    private String logo;
    private String licenseNo;
    private String operatingLicense;
    private String location ;
    private String email;
    private String  contactNo;
    private String county;
    private List<LegalService> legalServices;
    private List<Employee>  employees;
    private LocalDate dateOfIncorporation;

}
