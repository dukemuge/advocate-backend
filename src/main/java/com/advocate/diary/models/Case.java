package com.advocate.diary.models;

import jakarta.persistence.*;
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
    @Id
    @Column(name = "case_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="case_no")
    private String caseNo;

    @Column(name="date_of_filing")
    private LocalDate  dateOfFiling;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client  client;

    @Column(name="description")
    private String caseOutcome;

    private BillingDetail  billingDetail;

    @Enumerated(value = EnumType.STRING)
    @Column(name="case_status")
    private VerdictStatus caseStatus;

    @Column(name="mention_date")
    private LocalDate  mentionDate;

    @Column(name="hearing_date")
    private LocalDate hearingDate;

    @Column(name="judgement_date")
    private LocalDate judgementDate;

    @Column(name="case_description")
    public  String  caseDescription;

    @Column(name="defendant_name")
    private String defendantName;

    @Column(name="defendant_address")
    private String defendantAddress;

    @Column(name="crime_date")
    private LocalDate crimeDate;

    @Column(name="crime_location")
    private String crimeLocation;

    @Column(name="officer_in_charge")
    private String officerInCharge;

    @Column(name="arrest_date")
    private String arrestDate;

    @Column(name="judge_name")
    private String judgeName;

    @ManyToOne
    @JoinColumn(name = "case_id")
    private Lawyer lawyer;
    @Column(name="prosecutor_name")
    private String prosecutorName;

    @Column(name="judge_name")
    private LocalDate startingDate;

    @Column(name="case_summary")
    private String caseSummary;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "caseName")
    private List<SupportingDocument> supportingDocumentList;

    @Column(name = "date_of_creation")
    private LocalDate creationDate;
    @Column
    private LocalDate editDate;

    @Column(name = "is_completed")
    private boolean isCompleted;

    @Column(name = "is_payment_completed")
    private  boolean isPaymentCompleted;




}