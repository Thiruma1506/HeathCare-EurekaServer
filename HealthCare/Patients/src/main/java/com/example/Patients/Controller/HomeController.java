package com.example.Patients.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
    @GetMapping("/")
    public String greet() {
        return "The server is running ";
    }
}
