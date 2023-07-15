package com.advocate.diary.models;

import java.time.LocalDate;
import java.util.List;

public class Case{
    private long id;
    private String caseNo;
    private  Magistrate magistrate;
    private LocalDate  dateOfFiling;
    private Client  client;
    private String caseOutcome;
    private  CaseStatus caseStatus;
    private LocalDate  mentionDate;
    private LocalDate hearingDate;
    private LocalDate judgementDate;
    private List<SupportingDocument> supportingDocumentList;

}