package com.codegym.customer.controllers;


import com.codegym.customer.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("/")
    public ModelAndView getListCustomer() {
        return new ModelAndView("list", "customerList", this.iCustomerService.fillAll());
    }
}