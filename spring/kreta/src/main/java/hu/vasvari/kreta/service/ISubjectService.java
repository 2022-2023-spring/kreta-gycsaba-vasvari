package hu.vasvari.kreta.service;

import hu.vasvari.kreta.model.Subject;

import java.util.List;

public interface ISubjectService {

    public List<Subject> getAllSubject();
    public Subject getSubjectById(long id);
    public long saveOrUpdate(Subject subject);
    public void deleteById(long id);
}
