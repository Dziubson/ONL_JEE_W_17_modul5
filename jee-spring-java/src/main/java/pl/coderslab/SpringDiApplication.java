package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.HelloWorld;

public class SpringDiApplication {

    public static void main( String[] args ) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        HelloWorld hW = ctx.getBean("helloWorld", HelloWorld.class);
        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

        hW.hello();
        System.out.println(hW);
        helloWorld.hello();
        System.out.println(helloWorld);

        ctx.close();
    }

}
