package com.example.exceptions;

/**
 * Created by David on 18/09/2016.
 */
public class UsernameExistsException extends IllegalArgumentException {

    public UsernameExistsException(String s) {
        super(s);
    }
}
