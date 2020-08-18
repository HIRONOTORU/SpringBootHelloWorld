package com.example.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class HelloWorldService {
    
    public String getHelloWorldAndTime(){
        LocalDateTime helloWorldTime = LocalDateTime.now();
        
        return "HelloWorld" + " " + helloWorldTime;
    }
}
