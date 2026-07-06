package org.maninder.event;

import org.maninder.model.Student;

public class StudentRegisteredEvent {
    private final Student student;

    public StudentRegisteredEvent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
}

