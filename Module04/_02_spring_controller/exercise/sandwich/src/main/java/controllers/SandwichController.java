package controllers;

import model.Sandwich;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SandwichController {

    @GetMapping("/")
    public ModelAndView getIndex() {
        ModelAndView modelAndView = new ModelAndView("index");
        List<String> spiceSandwich = new ArrayList();
        spiceSandwich.add("Lettuce");
        spiceSandwich.add("Tomato");
        spiceSandwich.add("Mustard");
        spiceSandwich.add("Sprouts");
        modelAndView.addObject("spiceSandwich", spiceSandwich);
        modelAndView.addObject("sandwich", new Sandwich());
        return modelAndView;
    }

    @PostMapping("/")
    public ModelAndView getSandwich(@ModelAttribute Sandwich sandwich, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("result", sandwich.getSpice());
        return new ModelAndView("redirect:/");
    }
}
