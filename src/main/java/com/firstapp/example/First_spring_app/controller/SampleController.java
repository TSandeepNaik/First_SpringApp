package com.firstapp.example.First_spring_app.controller;
//controller contain all the api for the application
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample/apis")
public class SampleController {

    //creating first api - just like creating methods
    @GetMapping("/firstapi")     // because to get we use  GET HTTP Method
    public String firstApi(){
        return "this is my first get api";
    }

    @GetMapping("/firstapi2")     // because to get we use  GET HTTP Method
    public String firstApi2(){
        return "this is my second get api";
    }
}
