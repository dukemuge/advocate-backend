package com.advocate.diary.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Table(name = "inquiries")
@Getter
@Setter
@NoArgsConstructor
public class Inquiry {
    @Id
    @Column(name = "inquiry_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String message;
    private LocalDateTime localDateTime;
    private String sender;
    private String recipient;
    private String response;
    private boolean isAddressed;
}
