package com.example.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TsetRest
 * @Description TODO
 * @Author binD :-)
 * @Date 2020/4/4 16:05
 */
@RestController
public class TsetRest {

    @RequestMapping(value = "/testing")
    public String testing() {
        return "testing";
    }

}
