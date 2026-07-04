package org.maninder.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EmailNotificationService implements NotificationService {

    public String sendNotification() {
        return  "Email Notification Sent!";
    }
}
