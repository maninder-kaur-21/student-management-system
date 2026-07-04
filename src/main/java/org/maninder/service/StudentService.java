package org.maninder.service;

import org.maninder.model.Student;
import org.maninder.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    private final NotificationService notificationService;

    public StudentService(StudentRepository repository, @Qualifier("smsNotificationService") NotificationService notificationService) {
        this.studentRepository = repository;
        this.notificationService = notificationService;
    }

    public String sendNotification() {
        return notificationService.sendNotification();
    }

    public void addStudent(Student student) {
        int rows = studentRepository.saveStudent(student);
        if (rows > 0) {
            System.out.println("\nStudent saved successfully.");
        }
    }

    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    // Return null when no student exists with the given ID.
    public Student getStudentById(int id) {
        try {
            return studentRepository.getStudentById(id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    public boolean updateStudent(Student student) {
        return studentRepository.updateStudent(student) > 0;
    }

    public boolean deleteStudent(int id) {
        return studentRepository.deleteStudent(id) > 0;
    }
}


