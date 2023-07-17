package com.advocate.diary.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "cases")
@Getter
@Setter
@NoArgsConstructor
public class Case{
    private long id;
    private String caseNo;
    private LocalDate  dateOfFiling;
    private Client  client;
    private String caseOutcome;
    private  CaseStatus caseStatus;
    private LocalDate  mentionDate;
    private LocalDate hearingDate;
    private LocalDate judgementDate;
    public  String  CIN;
    private String defendantName;
    private String defendantAddress;
    private String crimeType;
    private String crimeDate;
    private String crimeLocation;
    private String officerName;
    private String arrestDate;
    private String judgeName;
    private String lawyerName;
    private String prosecutorName;
    private String startingDate;
    private String caseSummary;
    private List<SupportingDocument> supportingDocumentList;
    private List<Client> clients;


}