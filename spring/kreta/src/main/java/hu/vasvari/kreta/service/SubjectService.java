package hu.vasvari.kreta.service;

import hu.vasvari.kreta.model.PagedList;
import hu.vasvari.kreta.model.Subject;
import hu.vasvari.kreta.repo.interfaces.ISubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

    public PagedList<Subject> GetPaged(int currentPage, int pageSize) {
        Pageable page = PageRequest.of(currentPage,pageSize);
        // Java beépített Page<T> osztály
        Page<Subject> pageSubject=repo.findAll(page);
        // Készítettünk egy saját PagedList<T> osztályt
        // hogy a JavaBackend és C# frontend ugyan olyan
        // adattípussal kommunikáljon
        PagedList<Subject> pagedList=new PagedList<>();
        if (pageSubject.hasContent()) {
            //Java Page<T>ből az elemeket átmásoljuk a saját PagedList osztályba:
            pagedList.setCurrentPage(page.getPageNumber());
            pagedList.setPageSize(page.getPageSize());
            pagedList.setNumberOfItems(repo.count());
            int numberOfPage=(int) Math.floor(repo.count()/pageSize)+1;
            pagedList.setNumberOfPage(numberOfPage);
            pagedList.setItems(pageSubject.getContent());
            return pagedList;
        } else {
            return null;
        }
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
