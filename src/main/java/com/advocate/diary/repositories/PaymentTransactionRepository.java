package com.advocate.diary.repositories;

import com.advocate.diary.models.PaymentTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentTransactionRepository extends JpaRepository<PaymentTransaction,Long> {
}
