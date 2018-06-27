package com.xjh.controller;

import com.xjh.entity.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class IndexController {

    private static final String template = "hello，%s!";
    private final AtomicInteger count = new AtomicInteger();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name",defaultValue = "world") String name){
        return new Greeting(count.incrementAndGet(),
                String.format(template, name));
    }
}
