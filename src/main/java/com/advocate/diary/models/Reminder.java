package com.advocate.diary.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "reminders")
@Getter
@Setter
@NoArgsConstructor
public class Reminder {
    private long id;
    private String message;
    private LocalDateTime  dateSent;
    private String receiver;
    private String sender;
    @Column(name = "created_at")
    private LocalDate createdAt;
    @Column(name = "is_read")
    private boolean isRead;
}
