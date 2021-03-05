package com.codegym.controllers;

import com.codegym.model.Employee;
import com.codegym.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class EmployeeController {

    @Autowired
    private IEmployeeService iEmployeeService;

    @GetMapping("/")
    public ModelAndView getHome() {
        return new ModelAndView("home", "listEmployee", this.iEmployeeService.getAllEmployee());
    }

    @GetMapping("/create")
    public ModelAndView getViewCreate() {
        return new ModelAndView("create", "employee", new Employee());
    }

    @PostMapping("/create")
    public ModelAndView createEmployee(@ModelAttribute("employee") Employee employee) {
        this.iEmployeeService.saveEmployee(employee);
        return new ModelAndView("redirect:/");
    }
}
