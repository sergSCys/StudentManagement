package main.java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/students")
    public String showStudentList() {

        return "student-list";
    }
}
