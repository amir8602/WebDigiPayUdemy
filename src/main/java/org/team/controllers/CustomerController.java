package org.team.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.team.Customer;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {
        theModel.addAttribute("customer", new Customer());
        return "customer-form";
    }


    @RequestMapping("/processForm")
    public String processForm( @ModelAttribute("customer") @Valid Customer theCustomer,
                              BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "customer-form";
        } else {
            return "customer-confirmation";
        }
    }
}
