package com.advocate.diary.dtos;

import com.advocate.diary.models.Case;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class ClientDto {
    private long  id;
    private  String mobileNo;
    private String fullName;
    private  String postalCode;
    private String occupation;
    private String nationalId;
    private  String email;
    private List<Case> cases;
}
