package com.overseaslabs.examples.mailer.entity;

/**
 * Mail service provider response
 */
public class ProviderResponse {
    private Email email;
    private Boolean success;
    private String message;

    public ProviderResponse() {
    }

    public ProviderResponse(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public ProviderResponse(Boolean success, String message, Email email) {
        this(success, message);
        this.email = email;
    }

    public Email getEmail() {
        return email;
    }

    public Boolean getSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}