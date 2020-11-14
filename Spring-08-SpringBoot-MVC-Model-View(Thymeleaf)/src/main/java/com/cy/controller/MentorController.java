package com.cy.controller;

import com.cy.enums.Gender;
import com.cy.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/list")
    public String showTable(Model model){

        List<Mentor> mentorList = new ArrayList<>();

        mentorList.add(new Mentor("Mike", "Smith",45, Gender.MALE));
        mentorList.add(new Mentor("Tom", "Cruise",25, Gender.MALE));
        mentorList.add(new Mentor("Amy", "Smith",41, Gender.FEMALE));

        model.addAttribute("mentors", mentorList);

        return "mentor/mentor-list";
    }
}
