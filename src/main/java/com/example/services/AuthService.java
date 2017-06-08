package com.example.services;


import com.example.domain.User;
import com.example.exceptions.EmailExistsException;
import com.example.exceptions.UsernameExistsException;
import com.example.forms.UserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by David on 18/09/2016.
 */

@Service
public class AuthService {

    @Autowired
    UserService userService;

    @Transactional
    public User register(UserForm userForm) throws UsernameExistsException, EmailExistsException {
        if (userService.usernameExists(userForm.getUsername())) {
            throw new UsernameExistsException("There is an account with the same username: " + userForm.getUsername());
        }
        if (userService.emailExists(userForm.getEmail())) {
            throw new EmailExistsException("There is an account with the same email: " + userForm.getEmail());

        }
        User user = new User();
        user.setName(userForm.getName());
        user.setUsername(userForm.getUsername());
        user.setEmail(userForm.getEmail());
        user.setPassword(userForm.getPassword());
        return userService.save(user);

    }
}
