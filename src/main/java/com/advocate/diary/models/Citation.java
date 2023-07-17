package com.advocate.diary.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "citations")
@Getter
@Setter
@NoArgsConstructor
public class Citation{
    private String filename;
    private String description;
    private String nameOfWriter;

}