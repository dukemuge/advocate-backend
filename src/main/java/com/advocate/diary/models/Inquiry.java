package com.advocate.diary.models;

import java.time.LocalDateTime;


public class Inquiry {
    private long id;
    private String message;
    private LocalDateTime localDateTime;
    private String sender;
    private String recipient;
    private String response;
    private boolean isAddressed;
}
