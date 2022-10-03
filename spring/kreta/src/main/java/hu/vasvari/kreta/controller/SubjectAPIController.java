package hu.vasvari.kreta.controller;

import hu.vasvari.kreta.model.Subject;
import hu.vasvari.kreta.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/subject", name="Save subject")
    public void saveSubject(@RequestBody Subject subject) {
        service.saveOrUpdate(subject);
    }

    @PutMapping(value="/subject",name="Update subject")
    public void updateSubject(@RequestBody Subject subject) {
        service.saveOrUpdate(subject);
    }

    @DeleteMapping(value = "/subject/{id}",name="Delete subject")
    public void deleteSubject(@PathVariable long id) {
        service.deleteById(id);
    }
}
