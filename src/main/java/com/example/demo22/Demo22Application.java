package com.example.demo22;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
public class Demo22Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo22Application.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value="myName", defaultValue="World") String name){
        return String.format("Hellooooo %s!", name);
    }

    @GetMapping("/sql")
    public String sql(@RequestParam(value="myName", defaultValue="World") String name){

        return String.format("Hellooooo %s!", name);
    }





}
