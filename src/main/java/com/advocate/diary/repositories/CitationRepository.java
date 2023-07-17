package com.advocate.diary.repositories;

import com.advocate.diary.models.Citation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitationRepository extends JpaRepository<Citation,Long> {
}
