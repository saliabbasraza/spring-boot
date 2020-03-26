package com.basho.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class MainController {

    @Value("${app.developer.name}")
    private String developer;

    @RequestMapping("/")
    public String index() {
        return "Greetings from " + developer;
    }

}