package com.space.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "home"})
    public String landingPage(){
        return "index";
    }

    @GetMapping("/apod")
    public String library(){
        return "apod";
    }

    @GetMapping("/weather")
    public String weather() {return "weather";}

}
