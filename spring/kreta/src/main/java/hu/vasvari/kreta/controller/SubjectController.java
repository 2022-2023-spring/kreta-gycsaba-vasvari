package hu.vasvari.kreta.controller;

import hu.vasvari.kreta.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectController {
    @Autowired
    SubjectService service;
}
