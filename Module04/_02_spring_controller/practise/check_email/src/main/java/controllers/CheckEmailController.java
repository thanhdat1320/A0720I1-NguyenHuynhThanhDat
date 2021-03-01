package controllers;

import common.Validation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CheckEmailController {
    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

//    boolean flag = true;
    @PostMapping("/")
    public String checkEmail(@RequestParam String email, Model model) {
        if (!Validation.checkEmail(email)) {
            model.addAttribute("result", "email is not valid");
        } else {
            model.addAttribute("result", "accept");
        }
        return "index";
    }
}
