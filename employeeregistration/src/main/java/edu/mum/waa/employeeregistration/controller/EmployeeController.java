package edu.mum.waa.employeeregistration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/emp")
    public String welcome(){
        return "welcome";
    }
}
