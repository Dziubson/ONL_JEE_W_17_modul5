package pl.coderslab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.coderslab.beans.HelloWorld;

@Configuration
public class ApplicationConfig {

    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }

}
