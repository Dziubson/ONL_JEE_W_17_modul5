package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello world";
    }

}
