package hu.vasvari.kreta.controller;

import hu.vasvari.kreta.model.Subject;
import hu.vasvari.kreta.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class SubjectsController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/subject/index")
    public ModelAndView showSubjectList()
    {
        List<Subject> subjects = subjectService.getAllSubject();
        ModelAndView mav=new ModelAndView();
        mav.addObject("subjects",subjects);
        mav.setViewName("th/subjects/index");
        return mav;
    }

    @GetMapping ("/subject/signup")
    public ModelAndView showSingUpForm(){
        Subject newSubject=new Subject();
        ModelAndView mav=new ModelAndView();
        mav.setViewName("th/subjects/add-subject");
        mav.addObject("subject",newSubject);
        return mav;
    }

    @PostMapping("/subject/add-subject")
    public String addNewSubject(@Valid Subject subject, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "th/subject/add-subject";
        }
        subjectService.saveOrUpdate(subject);
        return "redirect:/subject/index";
    }

    @GetMapping("/subject/delete/{id}")
    public String deleteUser (@PathVariable("id") long id, Model model) {
        subjectService.deleteById(id);
        return "redirect:/subject/index";
    }

    @GetMapping("/subject/edit/{id}")
    public String showUpdateForm (@PathVariable("id") long id, Model model){
        Subject subject = subjectService.getSubjectById(id);
        model.addAttribute("subject", subject);
        return "th/subjects/update-subject";
    }

    @PostMapping("/subject/update/{id}")
    public String updateSubject(@PathVariable("id") Long id, @Valid Subject subject, BindingResult result, Model model) {
        if (result.hasErrors()){
            subject.setId(id);
            return "th/subjects/update-subject";
        }
        subjectService.saveOrUpdate(subject);
        return "redirect:/subject/index/";
    }
}
