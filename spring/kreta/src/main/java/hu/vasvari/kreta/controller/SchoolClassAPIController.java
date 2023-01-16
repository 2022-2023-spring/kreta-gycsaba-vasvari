package hu.vasvari.kreta.controller;


import hu.vasvari.kreta.model.SchoolClass;
import hu.vasvari.kreta.model.Subject;
import hu.vasvari.kreta.service.SchoolClassService;
import hu.vasvari.kreta.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api", name = "SchoolClass API controller")
public class SchoolClassAPIController {
    @Autowired
    SchoolClassService service;

    //localhost:8888/api/school_class/
    @GetMapping(value = "/school_class", name = "Get all class")
    public List<SchoolClass> getAllClass() {
        return service.getAllClass();
    }

    //localhost:8888/api/school_class/
    @PostMapping(value = "/school_class", name="Save class")
    public void saveSubject(@RequestBody SchoolClass schoolClass) {
        service.saveOrUpdate(schoolClass);
    }

    //localhost:8888/api/school_class/
    @PutMapping(value="/school_class", name="Update class")
    public void updateSubject(@RequestBody SchoolClass schoolClass) {
        service.saveOrUpdate(schoolClass);
    }

    //localhost:8888/api/school_class/1
    @DeleteMapping(value = "/school_class/{id}", name="Delete class")
    public void deleteSubject(@PathVariable long id) {
        service.deleteById(id);
    }
}
