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

    //localhost:8888/api/subject/
    @GetMapping(value = "/subject",name = "Get all subjects")
    public List<Subject> getAllSubject() {
        return service.getAllSubject();
    }

    //localhost:8888/api/subject/
    @PostMapping(value = "/subject", name="Save subject")
    public void saveSubject(@RequestBody Subject subject) {
        service.saveOrUpdate(subject);
    }

    //localhost:8888/api/subject/
    @PutMapping(value="/subject",name="Update subject")
    public void updateSubject(@RequestBody Subject subject) {
        service.saveOrUpdate(subject);
    }

    //localhost:8888/api/subject/1
    @DeleteMapping(value = "/subject/{id}",name="Delete subject")
    public void deleteSubject(@PathVariable long id) {
        service.deleteById(id);
    }
}
