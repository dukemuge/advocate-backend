package com.advocate.diary.repositories;

import com.advocate.diary.models.Case;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseRepository extends JpaRepository<Case,Long> {
}
