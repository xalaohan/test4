package com.example.test4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserinfoController {
    @GetMapping("say")
    public String say(){
        return "hello";
    }
}
