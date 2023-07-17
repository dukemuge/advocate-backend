package com.advocate.diary.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "billing_detail")
@Getter
@Setter
@NoArgsConstructor
public class BillingDetail {
    private String  accountName;
    private String payBill;

}
