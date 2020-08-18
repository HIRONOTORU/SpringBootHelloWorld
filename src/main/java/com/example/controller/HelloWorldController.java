package com.example.controller;

import com.example.service.HelloWorldService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HelloWorldController {
    
    @GetMapping("/hello")
    public String getHelloWorldAndTime(){
        HelloWorldService helloWorldService = new HelloWorldService();
        
        return helloWorldService.getHelloWorldAndTime();
    }
}
