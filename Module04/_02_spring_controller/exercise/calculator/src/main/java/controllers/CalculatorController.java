package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import services.ICalculatorService;

@Controller
public class CalculatorController {

    @Autowired
    private ICalculatorService calculatorService;

    @GetMapping("/")
    public ModelAndView getCalculator() {
        return new ModelAndView("index");
    }

    @PostMapping("/")
    public ModelAndView calculator(@RequestParam(defaultValue = "0") int num1, @RequestParam(defaultValue = "0") int num2, @RequestParam String val) {
        ModelAndView modelAndView = new ModelAndView("index");
        try {
            double result = this.calculatorService.calculator(num1, num2, val);
            modelAndView.addObject("result", result);
            modelAndView.addObject("num1", num1);
            modelAndView.addObject("num2", num2);
            modelAndView.addObject("val", val);
        } catch (Exception e) {
            modelAndView.addObject("message", e.getMessage());
        }
        return modelAndView;
    }
}
