package com.basho.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Value("${app.developer.name}")
    private String developer;

    @RequestMapping("/")
    public String index() {
        return "Greetings from " + developer;
    }

    @RequestMapping("/createOrder")
    public String createOrder() {
        return "createOrder ";
    }

    @RequestMapping("/viewOrder")
    public String viewOrder() {
        return "viewOrder";
    }

}