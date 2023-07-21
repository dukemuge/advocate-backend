package com.advocate.diary.models;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
@Getter
@Setter
@NoArgsConstructor
public class Appointment {
    @Id
    @GeneratedValue
    private Long id;
    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
    private LocalDate appointmentDate;
    private Time appointmentStartTime;
    private Time appointmentEndTime;
    private String lawyerName;
    private  String  nameOfClient;
    private AppointmentStatus status = AppointmentStatus.BOOKED;

    private BigDecimal price;



//    @Column(name = "start")
//    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
//    private LocalDateTime start;
//    @UpdateTimestamp
//    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
//    @Column(name = "end")
//    private LocalDateTime end;
//
//    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
//    @Column(name = "canceled_at")
//    private LocalDateTime canceledAt;


}
