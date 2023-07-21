package com.advocate.diary.dtos;

import com.advocate.diary.models.CourtType;
import jakarta.persistence.Column;

public class CourtDto {
    private long id;
    private String name;
    private String location;
    private CourtType courtType;
}
