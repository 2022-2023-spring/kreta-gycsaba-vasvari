package hu.vasvari.kreta.repo.interfaces;

import hu.vasvari.kreta.model.Subject;
import org.springframework.data.repository.CrudRepository;

public interface ISubjectRepo extends CrudRepository<Subject,Long> {
}
