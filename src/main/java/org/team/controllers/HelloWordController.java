package org.team.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.team.model.Person;


@Controller
public class HelloWordController {

    @RequestMapping("/show")
    public String showForm(Model model) {
        Person person = new Person("sara","babei",5);
        System.out.println("/show");
        model.addAttribute("person" , person);
        return "helloworld-form";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShouldDude(@RequestParam("studentName") String theName, Model model) {
        theName = theName.toUpperCase();
        String result = "Yo!" + theName;
        model.addAttribute("message", result);
        return "helloworld";

    }

    @RequestMapping("/processForm")
    public String processForm() {
        System.out.println("form");
        return "helloworld";
    }

    @RequestMapping("/sara")
    public String sara(@ModelAttribute("person") Person person) {
        System.out.println("sara");
        System.out.println(person.toString());
        return "index";
    }

}
