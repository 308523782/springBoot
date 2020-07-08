package com.bule.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

    @GetMapping("/hello")
    public  String someHandle() {
        return "hello world Spring boot";
    }
}
