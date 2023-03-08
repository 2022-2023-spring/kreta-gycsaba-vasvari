package hu.vasvari.kreta.controller;

import hu.vasvari.kreta.model.PagedList;
import hu.vasvari.kreta.model.QueryStringParameter;
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

    @PostMapping(value = "/Subject/getpaged")
    public PagedList<Subject> GetPaged(@RequestBody QueryStringParameter paramters) {
        int currentPage = paramters.getCurrentPage();
        if (currentPage<0) {
            currentPage=0;
        }
        int pageSize = paramters.getPageSize();
        if (pageSize<=0) {
            pageSize=1;
        }

        PagedList<Subject> pageSubject=service.GetPaged(currentPage,pageSize);
        return pageSubject;
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
