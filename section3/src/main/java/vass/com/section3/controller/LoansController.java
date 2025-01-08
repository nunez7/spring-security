package vass.com.section3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

    @GetMapping("/loans")
    public String sayWelcome(){
        return "Welcome to Spring Application with security";
    }

}
