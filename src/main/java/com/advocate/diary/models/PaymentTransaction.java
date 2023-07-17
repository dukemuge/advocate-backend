package com.advocate.diary.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "payment_transaction")
@Getter
@Setter
@NoArgsConstructor
public class PaymentTransaction {
    private  long id;
    private BigDecimal  amount;
    private LocalDate paymentDate;
    private BigDecimal balance;
    @ManyToOne
    private Client client;
    private Case caseName;

}
