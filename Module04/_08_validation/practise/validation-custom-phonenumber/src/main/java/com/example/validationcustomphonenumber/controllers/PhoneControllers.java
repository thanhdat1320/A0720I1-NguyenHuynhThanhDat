package com.example.validationcustomphonenumber.controllers;

import com.example.validationcustomphonenumber.services.IPhoneNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PhoneControllers {
    @Autowired
    private IPhoneNumberService iPhoneNumberService;

    @GetMapping("/")
    private ModelAndView getHome() {
        return new ModelAndView("list", "phoneList", this.iPhoneNumberService.getList());
    }
}
