package pl.coderslab.samples;

public class Main {

    public static void main(String[] args) {
        MessageSender messageSender = new MessageSender(new EmailService());
        messageSender.sendMessage();

        MessageSender messageSender2 = new MessageSender(new SmsService());
        messageSender2.sendMessage();

    }

}
