package hu.vasvari.kreta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControler {
    @RequestMapping(value={"","/","/index"},name = "The main page")
    public String index() {
        return "th/home/index";
    }
}
