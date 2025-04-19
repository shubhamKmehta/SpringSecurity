package com.mine.controller;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(HttpServletRequest request){
        return "hello from spring security" + " : "+request.getSession().getId();
    }




}
