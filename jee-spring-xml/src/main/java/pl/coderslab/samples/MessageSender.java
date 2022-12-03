package pl.coderslab.samples;

public class MessageSender {

    private NotificationService notificationService;

    public MessageSender(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendMessage() {
        notificationService.send();
    }

}
