package com.example.services;

import com.example.domain.User;
import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by David on 18/09/2016.
 */
@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public boolean usernameExists(String username) {
        User appUser = repository.findByUsername(username);
        return appUser != null;
    }

    public boolean emailExists(String email) {
        User appUser = repository.findByEmail(email);
        return appUser != null;
    }

    public User registerUser(User user) {
//        String rawPassword = user.getPassword();
//        String encodedPassword = passwordEncoder.encode(user.getPassword());
        return repository.save(user);
    }

    public User save(User user) {
        if (user == null) {
            throw new IllegalArgumentException("The user cannot be null");
        }
        return repository.save(user);
    }


}
