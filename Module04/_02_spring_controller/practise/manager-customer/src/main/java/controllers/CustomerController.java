package controllers;

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.ICustomerService;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping("/")
    public ModelAndView getAllCustomer() {
        List<Customer> customerList = this.customerService.getAllCustomer();
        return new ModelAndView("list", "customerList", customerList);
    }

    @GetMapping("/createCustomer")
    public ModelAndView getViewCreateCustomer() {
        return new ModelAndView("create");
    }

    @PostMapping("/createCustomer")
    public String createCustomer(@RequestParam String id, @RequestParam String name, @RequestParam String email, @RequestParam String address) {
        Customer customer = new Customer(id, name, email, address);
        this.customerService.saveCustomer(customer);
        return "redirect:/";
    }
}
