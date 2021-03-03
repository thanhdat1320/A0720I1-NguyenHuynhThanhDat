package controllers;

import model.Login;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.IUserService;

@Controller
public class LoginController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/")
    public ModelAndView getPageLogin() {
        return new ModelAndView("home", "login", new Login());
    }

    @PostMapping("/")
    public ModelAndView login(@ModelAttribute Login login, RedirectAttributes redirectAttributes) {
        User user = this.iUserService.checkLogin(login);
        if (user ==  null) {
            redirectAttributes.addFlashAttribute("error", "Login fail");
            return new ModelAndView("redirect:/");
        } else {
            return new ModelAndView("user", "user", user);
        }
    }
}
