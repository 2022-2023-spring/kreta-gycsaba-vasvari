package hu.vasvari.kreta.repo.interfaces;

import hu.vasvari.kreta.model.Subject;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ISubjectRepo extends PagingAndSortingRepository<Subject,Long> {
}
