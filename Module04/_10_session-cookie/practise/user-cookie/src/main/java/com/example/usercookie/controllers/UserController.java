package com.example.usercookie.controllers;

import com.example.usercookie.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
@SessionAttributes("user")
public class UserController {

    @ModelAttribute("user")
    public User user() {
        return new User();
    }

    @GetMapping("/login")
    public ModelAndView getHome(@CookieValue(name = "userCookie", defaultValue = "") String username, Model model) {
        model.addAttribute("username", username);
        return new ModelAndView("login");
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") User user,
                        HttpServletResponse response,
                        Model model,
                        @RequestParam("password") String password) {
        if ("dat".equals(user.getUsername()) && "123123".equals(password)) {
            Cookie cookie = new Cookie("user", user.getUsername());
            cookie.setMaxAge(24 * 60 * 60);
            response.addCookie(cookie);
            model.addAttribute("message", "Login succeed");
        } else {
            Cookie cookie = new Cookie("user", "");
            cookie.setMaxAge(60);
            response.addCookie(cookie);
            model.addAttribute("message", "Login failed");
        }
        return "login";
    }
}
