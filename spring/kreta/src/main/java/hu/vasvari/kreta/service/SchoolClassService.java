package hu.vasvari.kreta.service;


import hu.vasvari.kreta.model.SchoolClass;
import hu.vasvari.kreta.model.Subject;
import hu.vasvari.kreta.repo.interfaces.ISchoolClassRepo;
import hu.vasvari.kreta.repo.interfaces.ISubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SchoolClassService implements  ISchoolClassService{

    @Autowired
    ISchoolClassRepo repo;

    @Override
    public List<SchoolClass> getAllClass() {
        List<SchoolClass> classes = new ArrayList<SchoolClass>();
        repo.findAll().forEach(c -> classes.add(c));
        return classes;
    }

    @Override
    public SchoolClass getClassById(long id) {
        Optional<SchoolClass> c = repo.findById(id);
        if (c.isPresent())
            return c.get();
        else {
            return null;
        }
    }

    @Override
    public long saveOrUpdate(SchoolClass schoolClass) {
        repo.save(schoolClass);
        return schoolClass.getId();
    }

    @Override
    public void deleteById(long id) {
        Optional<SchoolClass> c = repo.findById(id);
        if (c.isPresent()){
            repo.deleteById(id);
        }
    }
}