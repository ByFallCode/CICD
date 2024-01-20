package com.fall.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("cicd")
public class MyController {

    @GetMapping("index")
    public Object index() {
        return "Hello World";
    }
}
