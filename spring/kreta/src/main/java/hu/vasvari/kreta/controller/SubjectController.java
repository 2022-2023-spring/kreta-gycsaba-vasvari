package hu.vasvari.kreta.controller;

import hu.vasvari.kreta.model.Subject;
import hu.vasvari.kreta.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectController {
    @Autowired
    SubjectService service;

    public List<Subject> getAllSubject() {
        return service.getAllSubject();
    }

}
