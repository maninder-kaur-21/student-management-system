package org.maninder.repository;

import org.maninder.model.Student;

import java.util.List;

public interface StudentRepository {

    int saveStudent(Student student);

    Student getStudentById(int id);

    List<Student> getAllStudents();

    int updateStudent(Student student);

    int deleteStudent(int id);
}