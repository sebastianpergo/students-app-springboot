package com.app.students;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {

    @GetMapping("/")
    public String sayHello() {
        return "This is the index page";
    }

}
