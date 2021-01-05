package com.deepak.sample;

import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
