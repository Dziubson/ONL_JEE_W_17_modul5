package pl.coderslab.samples;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SmsService implements NotificationService {

    public void send() {
        System.out.println("Sending sms");
    }
}
