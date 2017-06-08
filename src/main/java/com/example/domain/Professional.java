package com.example.domain;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by David on 12/10/2016.
 */
@Entity
@Table(name="professional")
public class Professional extends Caregiver {



    @NotNull
    @NotBlank
    private String description;

    public Professional(String description) {
        this.description = description;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
