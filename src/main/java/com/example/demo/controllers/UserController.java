package com.example.demo.controllers;

import com.example.demo.database.UserRepository;
import com.example.demo.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = {"/users"})
public class UserController {

    @Autowired
    private UserRepository repository;

    @RequestMapping(value = {"", "/"}, method = {RequestMethod.GET})
    public String list(Model model) {
        model.addAttribute("users", repository.findAll());
        return "/user/index";
    }

}
