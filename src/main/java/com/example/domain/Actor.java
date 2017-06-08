package com.example.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDate;

/**
 * Created by David on 12/10/2016.
 */

@Entity
public class Actor extends User{

    @NotNull
    private String phone;
    @NotNull
    @Past
    private LocalDate dateOfBirth;

    public Actor() {
    }

    public Actor(String phone, LocalDate dateOfBirth) {
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
    }

    public Actor(String username, String password, String email, String name, String phone, LocalDate dateOfBirth) {
        super(username, password, email, name);
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
