package hu.vasvari.kreta.service;

import hu.vasvari.kreta.repo.interfaces.ISubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    @Autowired
    ISubjectRepo repo;
}
