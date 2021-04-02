package com.example.basket.controllers;

import com.example.basket.models.Basket;
import com.example.basket.models.Product;
import com.example.basket.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@SessionAttributes("basketMap")
public class ProductController {

    @ModelAttribute("basketMap")
    public Map<Product, Integer> basketMap() {
        return new HashMap<>();
    }

    @Autowired
    private ProductService productService;

    @GetMapping(value = {"", "/list"})
    public ModelAndView getList() {
        return new ModelAndView("list", "listProduct", this.productService.findAll());
    }

    @GetMapping("/view/{id}")
    public ModelAndView getProduct(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView("view");
        modelAndView.addObject("product", this.productService.findById(id));
        modelAndView.addObject("basket", new Basket());
        return modelAndView;
    }

    @PostMapping("/view")
    public String buy(@ModelAttribute("product") Product product,
                      @ModelAttribute("basket") Basket basket,
                      @ModelAttribute("basketMap") Map<Product, Integer> basketMap) {
        if (basketMap.containsKey(product)) {
            basketMap.replace(product, basket.getAmount());
        } else {
            basketMap.put(product, basket.getAmount());
        }
        return "redirect:/list";
    }

    @GetMapping("/basket")
    public ModelAndView getBasket(@ModelAttribute("basketMap") Map<Product, Integer> basketMap, Model model) {
        return new ModelAndView("basket", "basketMap", basketMap);
    }

    @GetMapping("/edit/{id}/{amount}")
    public String editForm(@PathVariable("id") int id, @PathVariable("amount") int amount, Model model) {
        model.addAttribute("product", this.productService.findById(id));
        model.addAttribute("basket", new Basket(amount));
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("product") Product product, @ModelAttribute("basket") Basket basket, @ModelAttribute("basketMap") Map<Product, Integer> basketMap) {
        if (basketMap.containsKey(product)) {
            basketMap.replace(product, basket.getAmount());
        } else {
            basketMap.put(product, basket.getAmount());
        }
        return "redirect:/basket";
    }

    @GetMapping("/delete/{id}/{amount}")
    public String delete(@ModelAttribute("product") Product product, @ModelAttribute("basket") Basket basket, @ModelAttribute("basketMap") Map<Product, Integer> basketMap) {
        basketMap.remove(this.productService.findById(product.getId()), basket.getAmount());
        return "redirect:/basket";
    }

    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("product") Product product) {
        this.productService.save(product);
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        this.productService.delete(id);
        return "redirect:/list";
    }
}
