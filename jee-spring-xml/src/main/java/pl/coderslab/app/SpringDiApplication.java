package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.EmailService;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.MessageSender;
import pl.coderslab.beans.MessageService;

public class SpringDiApplication {

    public static void main( String[] args ) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld helloWorld = ctx.getBean("helloWorld", HelloWorld.class);
        helloWorld.printMessage();

        HelloWorld helloWorld2 = ctx.getBean("helloWorld", HelloWorld.class);
        helloWorld2.printMessage();

        HelloWorld helloWorld3 = ctx.getBean("helloWorld", HelloWorld.class);
        helloWorld3.printMessage();

        System.out.println(helloWorld.getMessage());

        MessageService messageService = ctx.getBean("emailService", EmailService.class);
        messageService.send();

        MessageSender messageSender = ctx.getBean("messageSender", MessageSender.class);
        messageSender.sendMessage();
        messageSender.sendMessageFromProperty();

        ctx.close();
    }

}
