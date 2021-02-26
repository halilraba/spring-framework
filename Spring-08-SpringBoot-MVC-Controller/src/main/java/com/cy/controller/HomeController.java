package com.cy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping()
    public String getRequestMapping11(){
        return "home";
    }

    @RequestMapping("/")
    public String getRequestMapping(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/ozzy")
    public String getRequestMapping2(){
        return "ozzy";
    }

    @RequestMapping("/cy")
    public String getRequestMapping3(){
        return "home";
    }

    @GetMapping("/sp")
    public String getMappingEx1(){
        return "ozzy";
    }

    @PostMapping("/spring")
    public String getMappingEx2(){
        return "home";
    }

    @GetMapping("/home/{name}/{email}")
    public String pathVariableEx(@PathVariable("name") String name, @PathVariable("email") String email){
        System.out.println("name is: " + name + "--- email is: " + email);
        return "home";
    }

    @GetMapping("/home/course")
    public String requestParamEx(@RequestParam("course") String course){
        System.out.println("course is: " + course);
        return "home";
    }

    @GetMapping(value = "home/course")
    public String requestParamEx2(@RequestParam(value = "course", required = false, defaultValue = "cyb") String course){
        System.out.println("course is: " + course);
        return "home";
    }


}
