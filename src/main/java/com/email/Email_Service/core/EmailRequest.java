package com.email.Email_Service.core;

public record EmailRequest(String to, String subject, String body) {
}
