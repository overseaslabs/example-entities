package com.overseaslabs.examples.mailer.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.ZonedDateTimeSerializer;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.ZonedDateTime;

@Entity
@Table(name = "email")
@EntityListeners(AuditingEntityListener.class)
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_generator")
    @SequenceGenerator(name = "sequence_generator", sequenceName = "email_sequence")
    private Integer id;

    @NotBlank
    private String recipient;

    @NotBlank
    @javax.validation.constraints.Email
    private String email;

    @NotBlank
    private String content;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    @JsonSerialize(using = ZonedDateTimeSerializer.class)
    private ZonedDateTime created;

    @UpdateTimestamp
    @Column(nullable = false, updatable = false)
    @JsonSerialize(using = ZonedDateTimeSerializer.class)
    private ZonedDateTime updated;


    public Integer getId() {
        return id;
    }

    public String getRecipient() {
        return recipient;
    }

    public Email setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Email setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Email setContent(String content) {
        this.content = content;
        return this;
    }

    public Email setCreated(ZonedDateTime created) {
        this.created = created;
        return this;
    }

    public Email setUpdated(ZonedDateTime updated) {
        this.updated = updated;
        return this;
    }
}