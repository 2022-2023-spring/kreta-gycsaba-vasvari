package hu.vasvari.kreta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name="subjectName",unique = true,nullable = false,length = 30)
    private String subjectName;
}
