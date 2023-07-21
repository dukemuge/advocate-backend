package com.advocate.diary.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "invoices")
@Getter
@Setter
@NoArgsConstructor
public class Invoice {
    @Id
    @Column(name = "invoice_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String invoiceId;
    private BigDecimal  amount;
    private String description;
    private String nameOfClient;
    private LocalDate dateOfIssue;
    private String sentBy;
}
