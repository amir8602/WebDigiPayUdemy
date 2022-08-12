package org.team.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.team.Person;

@Controller
@RequestMapping("/person")
public class PersonController {
    @PostMapping("/submit")
    public String post(Person person){
        System.out.println(person);
        return "redirect:/home";
    }
}
