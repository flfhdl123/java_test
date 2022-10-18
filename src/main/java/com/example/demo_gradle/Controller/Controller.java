package com.example.demo_gradle.Controller;


import com.example.demo_gradle.Service.DateService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo_gradle.Service.DateService;

@RestController
public class Controller {
    DateService service= new DateService();
    //private final DateService newservice;


    @RequestMapping("/date")
    @GetMapping
    @CrossOrigin("*")
    public Object home() {
        return service.get_time();
        //return DateService.get_time();
    }
}
