package com.advocate.diary.dtos;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CompetencyDto {
    private long id;
    private String name;
    private String description;
    private String yearOfPractice;
}
