package com.advocate.diary.models;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public class Appointment {
    private @Id @GeneratedValue Long id;
    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
    private LocalDate appointmentDate;
    private Time appointmentStartTime;
    private Time appointmentEndTime;
    private String nameOfDoctor;
    private AppointmentStatus status = AppointmentStatus.BOOKED;

    private BigDecimal price;



//    @Column(name = "start")
//    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
//    private LocalDateTime start;
//
//    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
//    @Column(name = "end")
//    private LocalDateTime end;
//
//    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
//    @Column(name = "canceled_at")
//    private LocalDateTime canceledAt;


}
