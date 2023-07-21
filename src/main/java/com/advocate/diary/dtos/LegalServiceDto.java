package com.advocate.diary.dtos;

import com.advocate.diary.models.Firm;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
public class LegalServiceDto {
    private long id;
    private String title;
    private String description;
    private String category;
    private BigDecimal price;
    private Firm firm;
}
