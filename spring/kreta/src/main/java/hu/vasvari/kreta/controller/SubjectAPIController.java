package hu.vasvari.kreta.controller;

import hu.vasvari.kreta.model.Subject;
import hu.vasvari.kreta.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api", name = "Subject API controller")
public class SubjectAPIController {
    @Autowired
    SubjectService service;

    @GetMapping(value = "/subject",name = "Get all subjects")
    public List<Subject> getAllSubject() {
        return service.getAllSubject();
    }

}
