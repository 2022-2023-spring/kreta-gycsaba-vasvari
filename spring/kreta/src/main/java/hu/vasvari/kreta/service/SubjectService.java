package hu.vasvari.kreta.service;

import hu.vasvari.kreta.model.Subject;
import hu.vasvari.kreta.repo.interfaces.ISubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService implements ISubjectService {

    @Autowired
    ISubjectRepo repo;

    @Override
    public List<Subject> getAllSubject() {
        return null;
    }

    @Override
    public Subject getSubjectById(long id) {
        return null;
    }

    @Override
    public long saveOrUpdate(Subject subject) {
        return 0;
    }

    @Override
    public void deleteById(long id) {

    }
}
