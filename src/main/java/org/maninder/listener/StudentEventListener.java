package org.maninder.listener;

import org.maninder.event.StudentRegisteredEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StudentEventListener {

    @EventListener
    public void handleStudentRegistration(StudentRegisteredEvent event) {
        System.out.println("=== StudentRegisteredEvent Triggered ===");
        System.out.println("Student Registered: " + event.getStudent().getFirstName());
        System.out.println("Sending welcome email to "+ event.getStudent().getFirstName() +"...");
    }
}
