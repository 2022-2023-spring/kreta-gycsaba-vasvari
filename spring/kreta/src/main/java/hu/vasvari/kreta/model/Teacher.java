package hu.vasvari.kreta.model;

import java.util.Calendar;

public class Teacher {

    private long id;
    private String firstName;
    private String lastName;
    private boolean wooman;

    public Teacher(long id, String firstName, String lastName, boolean wooman) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wooman = wooman;
    }
}
