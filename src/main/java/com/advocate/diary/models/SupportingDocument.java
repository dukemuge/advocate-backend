package com.advocate.diary.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "supporting_document")
@Getter
@Setter
@NoArgsConstructor
public class SupportingDocument {
    private long id;
    private String filename;
    private String fileLocation;
    private String  description;
    private Case caseName;

}
