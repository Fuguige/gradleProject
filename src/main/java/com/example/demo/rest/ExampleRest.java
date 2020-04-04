package com.example.demo.rest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Example
 * @Description TODO
 * @Author fubinD
 * @Date 2020/4/3
 */
@RestController
public class ExampleRest {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping(value = "/test")
    String test() {
        return "testing";
    }

}
