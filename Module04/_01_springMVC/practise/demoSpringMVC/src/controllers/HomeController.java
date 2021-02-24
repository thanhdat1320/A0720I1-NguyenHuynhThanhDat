package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {
    @RequestMapping(value = "/home")
    public ModelAndView getHomePage() {
        return new ModelAndView("home");
    }

    @RequestMapping(value = "/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        if ("dat".equals(username) && "123123".equals(password)) {
            model.addAttribute("message", "success");
            return "result";
        } else {
            return "home";
        }
    }
}
