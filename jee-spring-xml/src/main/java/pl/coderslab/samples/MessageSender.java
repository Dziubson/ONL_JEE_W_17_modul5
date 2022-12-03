package pl.coderslab.samples;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    private final NotificationService notificationService;

    public MessageSender(@Qualifier("smsService") NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendMessage() {
        notificationService.send();
    }

}
