package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.IConvertMoneyService;

@Controller
public class ChangMoneyController {

    @Autowired
    private IConvertMoneyService iConvertMoneyService;

    @GetMapping("/")
    public String getHome() {
        return "home";
    }

    @PostMapping("/convert")
    public String convert(@RequestParam String usd, Model model) {
        model.addAttribute("result", this.iConvertMoneyService.convert(Double.parseDouble(usd)));
        return "home";
    }
}
