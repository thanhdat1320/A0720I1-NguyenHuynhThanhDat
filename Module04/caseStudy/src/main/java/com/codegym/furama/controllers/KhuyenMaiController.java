package com.codegym.furama.controllers;

import com.codegym.furama.models.CS_Customer;
import com.codegym.furama.models.KhuyenMai;
import com.codegym.furama.services.KhuyenMaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/cinema")
public class KhuyenMaiController {
    @Autowired
    private KhuyenMaiService khuyenMaiService;

    @GetMapping(value = {"/", "/list"})
    public ModelAndView getList() {
        return new ModelAndView("khuyenMai/list", "khuyenMaiList", this.khuyenMaiService.findAll());
    }

    @GetMapping("/create")
    public String getFormCreate(Model model) {
        model.addAttribute("khuyenMai", new KhuyenMai());
        return "khuyenMai/create";
    }

    @PostMapping("/create")
    public ModelAndView create(@Valid @ModelAttribute(name = "khuyenMai") KhuyenMai khuyenMai, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("khuyenMai/create");
        } else {
            this.khuyenMaiService.save(khuyenMai);
            return new ModelAndView("redirect:/cinema/");
        }
    }

    @PostMapping("/delete")
    public String delete(@RequestParam(value = "id") int id) {
        this.khuyenMaiService.delete(id);
        return "redirect:/cinema/";
    }

    @PostMapping("/search")
    public ModelAndView search(@RequestParam("nameSearch") String keyword) {
        System.out.println(this.khuyenMaiService.search(keyword).toString());
        return new ModelAndView("khuyenMai/list", "khuyenMaiList", this.khuyenMaiService.search(keyword));
    }
}
