package com.codegym.furama.controllers;

import com.codegym.furama.models.CS_Customer;
import com.codegym.furama.services.ICustomerService;
import com.codegym.furama.services.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerService iCustomerService;

    @Autowired
    private ICustomerTypeService iCustomerTypeService;

    @GetMapping(value = {"/", "/list"})
    public ModelAndView getList(@PageableDefault(3) Pageable pageable) {
        return new ModelAndView("customer/list", "customerList", this.iCustomerService.findAll(pageable));
    }

    @GetMapping("/create")
    public String getFormCreate(Model model) {
        List<String> listGender = Arrays.asList("male", "female", "other");
        model.addAttribute("customer", new CS_Customer());
        model.addAttribute("listGender", listGender);
        model.addAttribute("listTypeCustomer", this.iCustomerTypeService.findAll());
        return "customer/create";
    }

    @PostMapping("/create")
    public ModelAndView create(@Valid @ModelAttribute(name = "customer") CS_Customer cs_customer, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            List<String> listGender = Arrays.asList("Male", "Female", "Other");
            model.addAttribute("listGender", listGender);
            model.addAttribute("listTypeCustomer", this.iCustomerTypeService.findAll());
            return new ModelAndView("customer/create");
        } else {
            this.iCustomerService.save(cs_customer);
            return new ModelAndView("redirect:/customer/");
        }
    }

    @PostMapping("/delete")
    public String delete(@RequestParam(value = "id") int id) {
        this.iCustomerService.delete(id);
        return "redirect:/customer/";
    }

    @GetMapping("/view")
    public ModelAndView getView(@RequestParam(value = "id") int id) {
        return new ModelAndView("customer/view", "customer", this.iCustomerService.findById(id));
    }

    @GetMapping("/edit")
    public ModelAndView getFormEdit(@RequestParam(value = "idCustomer") int id) {
        List<String> listGender = Arrays.asList("male", "female", "other");
        ModelAndView modelAndView = new ModelAndView("/customer/edit");
        modelAndView.addObject("listTypeCustomer", this.iCustomerTypeService.findAll());
        modelAndView.addObject("listGender", listGender);
        modelAndView.addObject("customer", this.iCustomerService.findById(id));
        return modelAndView;
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("customer") CS_Customer cs_customer) {
        this.iCustomerService.save(cs_customer);
        return "redirect:/customer/";
    }

    @PostMapping("/search")
    public ModelAndView search(@PageableDefault(3) @RequestParam("nameSearch") String keyword, Pageable pageable) {
        return new ModelAndView("customer/list", "customerList", this.iCustomerService.search(keyword, pageable));
    }
}
