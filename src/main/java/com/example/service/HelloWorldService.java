package com.example.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Service
public class HelloWorldService {
    
    public String getHelloWorldAndTime(){
        LocalDateTime helloWorldTime = LocalDateTime.now();
        
        return "HelloWorld" + " " + helloWorldTime.format(DateTimeFormatter.ofPattern("yyyy'年'MM'月'dd'日'"));
    }
}
