package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"/test"})
public class TestController {

    @RequestMapping(value = {"/","/index"}, method = {RequestMethod.GET})
    public String index() {
        return "/test/index";
    }
    
    @RequestMapping(value = {"/toto","/toto/toto"}, method = {RequestMethod.GET})
    public String index1() {
        return "/test/index1";
    }
    
    @RequestMapping(value = {"/{id}"}, method = {RequestMethod.GET})
    public String index2(@PathVariable Integer id) {
        return "/test/index2";
    }
    
    @RequestMapping(value = {"/{id}/test/{id1}"}, method = {RequestMethod.GET})
    public String index3(@PathVariable Integer id, @PathVariable String id1) {
        return "/test/index2";
    }
}
