package hu.vasvari.kreta.service;

import hu.vasvari.kreta.model.Subject;
import hu.vasvari.kreta.repo.interfaces.ISubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SubjectService implements ISubjectService {

    @Autowired
    ISubjectRepo repo;

    @Override
    public List<Subject> getAllSubject() {
        List<Subject> subjects = new ArrayList<Subject>();
        repo.findAll().forEach(subject ->subjects.add(subject));
        return subjects;
    }

    @Override
    public Subject getSubjectById(long id) {
        Optional<Subject> subject=repo.findById(id);
        if (subject.isPresent())
            return subject.get();
        else
            return null;
    }

    @Override
    public long saveOrUpdate(Subject subject) {
        repo.save(subject);
        return subject.getId();
    }

    @Override
    public void deleteById(long id) {
        Optional<Subject> subject=repo.findById(id);
        if (subject.isPresent())
            repo.deleteById(id);
    }
}
