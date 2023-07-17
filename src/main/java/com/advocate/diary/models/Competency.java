package com.advocate.diary.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "competencies")
@Getter
@Setter
@NoArgsConstructor
public class Competency {
    private long id;
    private String name;
    private String description;
    private String yearOfPractice;
}
