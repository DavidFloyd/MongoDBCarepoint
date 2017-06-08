package com.example.controllers;


import com.example.domain.User;
import com.example.forms.UserForm;
import com.example.services.AuthService;
import com.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by David on 18/09/2016.
 */

@Controller
public class AuthController {

    @Autowired
    UserService userService;

    @Autowired
    AuthService authService;

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String getRegistration(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String postRegistration(@Valid UserForm userForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "register";
        }
        User user = new User();
        user.setName(userForm.getName());
        user.setEmail(userForm.getEmail());
        user.setUsername(userForm.getUsername());
        user.setPassword(userForm.getPassword());
        user = userService.registerUser(user);
        return "redirect:/";
    }
}
