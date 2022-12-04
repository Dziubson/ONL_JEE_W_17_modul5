package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {

    private Random random = new Random();

    @GetMapping(value = "/showRandom", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String showRandom() {
        int randomNumber = random.nextInt(100) + 1;
        return "Wylosowano liczbę: " + randomNumber;
    }

}
