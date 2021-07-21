package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")

public class Demo {

    @GetMapping("/users")
    public String getById() {
        //Optional<User> user = userService.getById(id);
      return "<h1>Hello Maveric Java Devops Team</h1>";
    }
}
