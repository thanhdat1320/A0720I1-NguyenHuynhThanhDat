package com.codegym.furama.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/furama")
public class HomeController {

    @GetMapping("")
    public ModelAndView getHome() {
        return new ModelAndView("home");
    }
}
