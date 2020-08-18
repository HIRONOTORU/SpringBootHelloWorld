package com.example.controller;

import org.junit.jupiter.api.Test;

public class HelloWorldControllerTest {
    @Test
    public void getTimeOfHelloWorld(){
        HelloWorldController helloWorldController = new HelloWorldController();
        
        System.out.println(helloWorldController.getHelloWorldAndTime());
    }
}