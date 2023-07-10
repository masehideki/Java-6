package com.hide.hellospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellospringController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring";
    }
}
