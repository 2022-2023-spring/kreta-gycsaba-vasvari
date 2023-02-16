package hu.vasvari.kreta.repo.interfaces;

import hu.vasvari.kreta.model.SchoolClass;
import org.springframework.data.repository.CrudRepository;

public interface ISchoolClassRepo extends CrudRepository<SchoolClass, Long> {
}
