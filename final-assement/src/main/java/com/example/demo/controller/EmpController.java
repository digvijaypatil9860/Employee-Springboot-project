package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Model.Emp;
import com.example.demo.Service.EmpServiceIMPL;

import ch.qos.logback.core.model.Model;

@Controller
public class EmpController {
    @Autowired
    EmpServiceIMPL service;

    @GetMapping("/index")
    public String home() {
        return "index";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";

    }

    // Add Employee
    @PostMapping("/signup")
    public String fun(@ModelAttribute Emp a) {
        service.addEmp(a);
        System.out.println("Employee added");
        return "index";
    }

    // Delete Employee
    @GetMapping("/deleteEmp/{id}")
    public String deleteEmp(@PathVariable int id) {
        service.deleteEmp(id);
        System.out.println("User is deleted!");
        return "redirect:/index";
    }

    // selction of Employee
    @GetMapping("/allEmp")
    public String showAllUsers(Model model) {
        List<Emp> allUsers = service.getAllEmps();
        Object allEmp;
        model.addAttribute("Emp", allEmp);
        System.out.println("All Data is readable");
        return "allUsersView"; 

}
}