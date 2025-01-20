package com.example.Java_Spring_Project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

public class HelloController {

    @GetMapping(value = "/")
    public String hello(){
        return "Hello Vistula, in my first Spring Controller.";
    }
    @GetMapping("/greeting")
    public String greeing(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    //http:/localhost:8080/greeting?name=Vistula
}
