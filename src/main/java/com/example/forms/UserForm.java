package com.example.forms;

/**
 * Created by David on 19/09/2016.
 */

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by David on 18/09/2016.
 */
public class UserForm {

    @NotBlank
    @Length(min = 3)
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Length(min = 3)
    private String password;

    @NotBlank
    @Length(min = 3)
    private String username;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
