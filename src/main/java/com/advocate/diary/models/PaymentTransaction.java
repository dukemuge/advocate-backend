package com.advocate.diary.models;

import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PaymentTransaction {
    private  long id;
    private BigDecimal  amount;
    private LocalDate localDate;
    private BigDecimal balance;
    @ManyToOne
    private Client client;

}
