package org.maninder.service;

import org.springframework.stereotype.Service;

@Service("smsNotificationService")
public class SMSNotificationService implements NotificationService {

    public String sendNotification() {
        return  "SMS Notification Sent!";
    }
}
