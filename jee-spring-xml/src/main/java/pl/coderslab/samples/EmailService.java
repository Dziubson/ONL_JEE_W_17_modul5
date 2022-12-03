package pl.coderslab.samples;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
public class EmailService implements NotificationService {

    public void send() {
        System.out.println("Sending email");
    }

}
