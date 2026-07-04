package org.maninder;

import org.maninder.config.AppConfig;
import org.maninder.model.Gender;
import org.maninder.model.Student;
import org.maninder.service.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);) {

            StudentService service = context.getBean(StudentService.class);

            // 1. Create a new student
            Student student = new Student();
            student.setFirstName("Alice");
            student.setLastName("Jane");
            student.setGender(Gender.FEMALE);
            student.setEmail("alice+jane@example.com");
            student.setCourse("Spring Framework");
            student.setSemester(4);

            System.out.println("\n===== ADD STUDENT =====");
            service.addStudent(student);

            // 2. Display all students

            System.out.println("\n===== VIEW ALL STUDENTS =====");
            service.getAllStudents().forEach(System.out::println);

            // 3. Read one student
            System.out.println("\n===== SEARCH STUDENT BY ID =====");
            Student existing = service.getStudentById(21);

            // 4. Update a field
            if (existing != null) {
                System.out.println(existing);

                System.out.println("\n===== UPDATE STUDENT =====");
                existing.setCourse("Advanced Spring");
                if (service.updateStudent(existing)) {
                    System.out.println("Student Updated Successfully");
                    // 5. Verify the update
                    System.out.println(service.getStudentById(21));
                } else {
                    System.out.println("Student Not Found");
                }
            } else {
                System.out.println("Student not found.");
            }

            // 6. Delete a student
            System.out.println("\n===== DELETE STUDENT =====");
            if (service.deleteStudent(20)) {
                System.out.println("Student Deleted");
            } else {
                System.out.println("Student Not Found");
            }

            // 7. Display all students again
            System.out.println("\n===== VIEW ALL STUDENTS =====");
            service.getAllStudents().forEach(System.out::println);

            System.out.println("\n" + service.sendNotification());
        }
    }

}
