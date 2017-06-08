package com.example.controllers;

/**
 * Created by David on 21/09/2016.
 */

import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    UserRepository repo;

    @RequestMapping("/")
    public String index(Model model){
        return "index";
    }

}
