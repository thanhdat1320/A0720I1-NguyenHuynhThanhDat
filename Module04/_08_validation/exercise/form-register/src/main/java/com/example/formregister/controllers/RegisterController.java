package com.example.formregister.controllers;

import com.example.formregister.models.Register;
import com.example.formregister.services.IRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class RegisterController {
    @Autowired
    private IRegisterService iRegisterService;

    @GetMapping("/")
    public ModelAndView getList(@PageableDefault(value = 5) Pageable pageable) {
        return new ModelAndView("list", "registerList", this.iRegisterService.findAll(pageable));
    }

    @GetMapping("/create")
    public ModelAndView getFormCreate() {
        return new ModelAndView("create", "register", new Register());
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute Register register, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "create";
        } else {
            this.iRegisterService.save(register);
            return "redirect:/";
        }
    }
}
