package com.cyb.controller;

import com.cyb.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name", "Ozzy");
        model.addAttribute("hi", "Hello");

        String subject = "Collections";
        model.addAttribute("subject", subject);

        int studentId = new Random().nextInt(1000);
        model.addAttribute("studentId", studentId);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        model.addAttribute("numbers", numbers);

        LocalDate birthday = LocalDate.now().minusYears(31);
        model.addAttribute("birthday", birthday);


        Student student = new Student(1, "Mike", "Smith");
        model.addAttribute("student", student);



        return "student/welcome";
    }

    @GetMapping("/register")
    public String homePage2(){
        return "student/register";
    }



}
