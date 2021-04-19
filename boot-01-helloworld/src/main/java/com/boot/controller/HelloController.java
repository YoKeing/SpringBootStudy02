package com.boot.controller;

import com.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
//@Controller
@RestController
public class HelloController {

    @Autowired
    Person person;


    @GetMapping("/person")
    public Person person(){
        return person;
    }


    @RequestMapping("/hello")
    public String handle01(){
        return "Hello, Spring Boot 2!";
    }

}
