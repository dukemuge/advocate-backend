package com.advocate.diary.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "competencies")
@Getter
@Setter
@NoArgsConstructor
public class Competency {
    @Id
    @Column(name = "competency_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "year_of_practice")
    private String yearOfPractice;

    //TODO:Many to Many with lawyer
    //1 Competency can have many lwayers
    //1 Lawyer will have many competency

}
