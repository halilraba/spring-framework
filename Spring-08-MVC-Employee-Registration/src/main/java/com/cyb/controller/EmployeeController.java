package com.cyb.controller;

import com.cyb.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/register")
    public String employeeRegister(Model model){

        model.addAttribute("employee", new Employee());

        List<String> stateList = new ArrayList<>();
        stateList.add("AR");
        stateList.add("AL");
        stateList.add("VA");
        stateList.add("MD");
        stateList.add("DC");
        model.addAttribute("states", stateList);

        return "employee-register";
    }

    @PostMapping("/confirm")
    public String confirmEmployee(@ModelAttribute("employee") Employee emp){



        return "employee-confirm";
    }

}
