package com.advocate.diary.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "courts")
@Getter
@Setter
@NoArgsConstructor
public class Court {
    @Id
    @Column(name = "court_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "court_type")
    private CourtType courtType;
}