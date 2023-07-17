package com.advocate.diary.repositories;

import com.advocate.diary.models.Court;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourtRepository extends JpaRepository<Court,Long> {
}
