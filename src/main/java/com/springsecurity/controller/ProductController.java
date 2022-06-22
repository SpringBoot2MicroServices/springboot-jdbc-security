package com.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/")
    public String home(){
        return "<h2> Hello from product controller - home !!! </h2>";
    }

    @GetMapping("/user")
    public String user(){
        return "<h2> Hello from User or Admin</h2>";
    }

    @GetMapping("/admin")
    public String admin(){
        return "<h2> Hello from admin </h2>";
    }
}
