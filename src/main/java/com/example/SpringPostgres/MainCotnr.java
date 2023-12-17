package com.example.SpringPostgres;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.LocalTime;

@Controller
public class MainCotnr {
    @GetMapping("/")
    public String a(){
        return LocalTime.now().toString();
    }
}
