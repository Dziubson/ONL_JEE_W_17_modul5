package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDiApplication {

    public static void main( String[] args ) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");



        ctx.close();
    }

}
