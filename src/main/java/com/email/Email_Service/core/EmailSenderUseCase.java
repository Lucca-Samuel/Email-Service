package com.email.Email_Service.core;

public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String body);
}
