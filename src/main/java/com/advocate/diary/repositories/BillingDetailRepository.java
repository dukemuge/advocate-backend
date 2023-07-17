package com.advocate.diary.repositories;

import com.advocate.diary.models.BillingDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingDetailRepository extends JpaRepository<BillingDetail,Long> {
}
