package com.aliaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class HelloWorldApp {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApp.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value="name", defaultValue="World") String name) {
        return "Hello, " + name + "!";
    }

    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}
