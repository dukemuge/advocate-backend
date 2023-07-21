package com.advocate.diary.dtos;

import com.advocate.diary.models.Lawyer;
import com.advocate.diary.models.LegalService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Firm {
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
    private List<Lawyer>  lawyers;
    private LocalDate dateOfIncorporation;
}
