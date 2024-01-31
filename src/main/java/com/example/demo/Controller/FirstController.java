package com.example.demo.Controller;

import com.example.demo.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class FirstController {

    @Autowired
    TestService testService;

    @GetMapping("hello")
    public String HelloWorld(){
        return "HelloWorld";
    }

    @PostMapping("getToken")
    public String test() throws IOException {
        return testService.test();
    }
}
