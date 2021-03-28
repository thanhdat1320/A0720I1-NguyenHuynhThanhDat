package com.example.managerpage.controllers;

import com.example.managerpage.models.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("count")
public class CounterController {

    @ModelAttribute("count")
    public Counter counter() {
        return new Counter();
    }

    @GetMapping("/")
    public String getIndex(@ModelAttribute("count") Counter counter) {
        counter.increment();
        return "index";
    }
}
