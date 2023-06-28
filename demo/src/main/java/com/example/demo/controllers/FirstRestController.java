package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController  //setting up the restcontroller
public class FirstRestController {

    @GetMapping("/")   //handling the HTTP GET request
    public String sayHello(){
        return "Hello World!";
    }
    @Value("Spring")
    private  String topicName;

    @GetMapping("/topic")
    public  String getTopic(){
        return "Topic: " + topicName;
    }

    @Value("${trainer.name}")
    private String coachname;

    @GetMapping("/coachname")
    public String getCoachname(){
        return  "Coach name: " + coachname;
    }

    @Value("${topic}")
    private  String teamname;

    @GetMapping("/teamname")
    public String getTeamName(){
        return teamname;
    }

    @GetMapping("/ok")    //handling the HTTP GET request
    public String sayOk(){
        return "Hellooooo";
    }
}
