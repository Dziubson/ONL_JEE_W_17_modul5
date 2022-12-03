package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.Ship;

public class SpringDiApplication {

    public static void main( String[] args ) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        HelloWorld hW = ctx.getBean("helloWorld", HelloWorld.class);
        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

        hW.hello();
        System.out.println(hW);
        helloWorld.hello();
        System.out.println(helloWorld);

        Ship ship = ctx.getBean("blackPearl", Ship.class);
        ship.getCaptain().startSailing();

        ctx.close();
    }

}
