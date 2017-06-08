package com.example.exceptions;

/**
 * Created by David on 18/09/2016.
 */
public class EmailExistsException extends IllegalArgumentException {

    public EmailExistsException(String s) {
        super(s);
    }
}
