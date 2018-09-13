package com.overseaslabs.examples;

/**
 * For message-based communications
 */
public class Message<T> {
    /**
     * Message codes
     */
    public enum Code {
        EMAIL_FAILED, EMAIL_SENT
    }

    /**
     * Message payload
     */
    private T payload;
    private String message;
    private Code code;

    public Message(Code code, T payload, String message) {
        this.code = code;
        this.payload = payload;
        this.message = message;
    }

    public T getPayload() {
        return payload;
    }

    public String getMessage() {
        return message;
    }

    public Code getCode() {
        return code;
    }
}
