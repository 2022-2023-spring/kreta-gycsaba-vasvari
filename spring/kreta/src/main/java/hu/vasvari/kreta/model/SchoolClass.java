package hu.vasvari.kreta.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "school_class")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SchoolClass {
    @Id
    @Column(name = "id")
    private long id;

    @Column(name="schoolClass", unique = true, nullable = false)
    private int schoolClass;

    @Column(name="classType", unique = true, nullable = false, length = 1)
    private char classType;

    @Column(name="teacherId")
    private int teacherId;
}
