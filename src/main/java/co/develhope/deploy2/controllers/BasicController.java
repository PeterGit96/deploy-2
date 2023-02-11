package co.develhope.deploy2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping
public class BasicController {

    @GetMapping
    public int getSum() {
        Random random = new Random();
        return (random.nextInt(500)+1) + (random.nextInt(500)+1);
    }

}