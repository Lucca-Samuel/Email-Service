package com.email.Email_Service.adapters;

public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String body);
}
