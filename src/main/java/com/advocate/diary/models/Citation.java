package com.advocate.diary.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "citations")
@Getter
@Setter
@NoArgsConstructor
public class Citation{
    @Id
    @Column(name = "citation_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="file_name")
    private String filename;

    @Column(name="description")
    private String description;

    @Column(name="name_of_publisher")
    private String publisher;

    @Column(name="date_of_creation")
    private LocalDate creationDate;

    @Column(name="date_of_publish")
    private LocalDate publishDate;

}