package com.advocate.diary.dtos;

import com.advocate.diary.models.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class CaseDto {

//    private LocalDate creationDate;
//    private LocalDate editDate;

    private long id;
    private String caseNo;
    private LocalDate  dateOfFiling;
    private Client client;
    private String caseOutcome;
    private BillingDetail billingDetail;
    private VerdictStatus caseStatus;
    private LocalDate  mentionDate;
    private LocalDate hearingDate;
    private LocalDate judgementDate;
    private  String  caseDescription;
    private String defendantName;
    private String defendantAddress;
    private LocalDate crimeDate;
    private String crimeLocation;
    private String officerInCharge;
    private String arrestDate;
    private String judgeName;
    private Lawyer lawyer;
    private String prosecutorName;
    private LocalDate startingDate;
    private String caseSummary;
    private List<SupportingDocument> supportingDocumentList;
    private boolean isCompleted;
    private  boolean isPaymentCompleted;

//    @Column(name = "date_of_creation")
//    private LocalDate creationDate;
//    @Column
//    private LocalDate editDate;



}
