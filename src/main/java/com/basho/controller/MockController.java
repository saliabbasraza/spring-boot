package com.basho.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MockController {

    @RequestMapping("/mock")
    public String index() {
        /*TODO Handle generic mock responses from reseources/mocks folder*/
        return "";
    }

}