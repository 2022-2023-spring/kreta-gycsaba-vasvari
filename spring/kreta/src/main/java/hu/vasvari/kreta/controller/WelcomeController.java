package hu.vasvari.kreta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/welcome", name = "Welcome controller")
public class WelcomeController {

    @GetMapping(value = "/hellovue", name = "Vue hello page")
    public String getVueHello(){
        return "Hello, itt a Vue";
    }
}
