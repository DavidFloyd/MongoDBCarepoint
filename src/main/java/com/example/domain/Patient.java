package com.example.domain;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

/**
 * Created by David on 12/10/2016.
 */
@Table(name="patient")
@Entity
public class Patient extends Actor {


    @NotNull
    @NotBlank
    private String relevantInfo;

    public Patient(String username, String password, String email, String name, String phone, LocalDate dateOfBirth, String relevantInfo) {
        super(username, password, email, name, phone, dateOfBirth);
        this.relevantInfo = relevantInfo;
    }


    public String getRelevantInfo() {
        return relevantInfo;
    }

    public void setRelevantInfo(String relevantInfo) {
        this.relevantInfo = relevantInfo;
    }
}
