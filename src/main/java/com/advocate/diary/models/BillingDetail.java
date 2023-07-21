package com.advocate.diary.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "billing_detail")
@Getter
@Setter
@NoArgsConstructor
public class BillingDetail {
    private String  accountName;
    private String payBill;
    private BigDecimal amount;
    private String phoneNo;
    private PaymentType  paymentType;
    private String bank;

}
