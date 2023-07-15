package com.advocate.diary.models;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class Notification {
    @Column(name = "title")
    private String title;

    @Column(name = "message")
    private String message;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "url")
    private String url;

    @Column(name = "is_read")
    private boolean isRead;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
