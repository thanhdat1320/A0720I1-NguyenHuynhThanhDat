package com.codegym.blog.controllers;

import com.codegym.blog.services.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController {

    @Autowired
    private IBlogService iBlogService;

    @GetMapping("/")
    public ModelAndView getList(Pageable pageable) {
        return new ModelAndView("list", "listBlog", this.iBlogService.findAll(pageable));
    }
}
