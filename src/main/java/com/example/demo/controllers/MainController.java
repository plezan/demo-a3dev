package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.controllers.utils.MappedRoutes;
import com.example.demo.database.UserRepository;
import com.example.demo.entities.User;

@Controller
public class MainController {
    
    @Autowired
    private UserRepository userRepository;

    @RequestMapping
    public String genericRedirection() {
        return "redirect:/index";
    }
    
    @RequestMapping(value = {"/","/index"}, method = {RequestMethod.GET})
    public String index(Model model) {
        User user = new User();
        user.setFirstname("toto");
        this.userRepository.save(user);
        
        model.addAttribute("links",MappedRoutes.getInstance().getRoutes());
        
        return "/index";
    }
    
    @RequestMapping(value = {"/toto","/toto/toto"}, method = {RequestMethod.GET})
    public String index1() {
        return "/index1";
    }
}
