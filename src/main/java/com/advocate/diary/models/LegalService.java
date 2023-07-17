package com.advocate.diary.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "legal_services")
@Getter
@Setter
@NoArgsConstructor
public class LegalService {
    private long id;
    private String title;
    private String description;
    private String category;
    private BigDecimal price;

}
