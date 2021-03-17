package com.codegym.validateforms.controllers;

import com.codegym.validateforms.models.User;
import com.codegym.validateforms.services.IUserService;
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
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/")
    public ModelAndView getList(@PageableDefault(size = 5) Pageable pageable) {
        return new ModelAndView("list", "listUser", this.iUserService.findAll(pageable));
    }

    @GetMapping("/create")
    public ModelAndView getFormCreate() {
        return new ModelAndView("create", "user", new User());
    }

    @PostMapping("/create")
    public ModelAndView createUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("create");
        } else {
            this.iUserService.save(user);
            return new ModelAndView("redirect:/");
        }
    }
}
