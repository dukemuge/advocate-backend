package com.advocate.diary.repositories;

import com.advocate.diary.models.Firm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LawFirmRepository extends JpaRepository<Firm,Long> {
}
