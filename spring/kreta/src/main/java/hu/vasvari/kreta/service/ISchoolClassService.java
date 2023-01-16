package hu.vasvari.kreta.service;

import hu.vasvari.kreta.model.SchoolClass;
import hu.vasvari.kreta.model.Subject;

import java.util.List;

public interface ISchoolClassService {

    public List<SchoolClass> getAllClass();
    public SchoolClass getClassById(long id);
    public long saveOrUpdate(SchoolClass schoolClass);
    public void deleteById(long id);
}
