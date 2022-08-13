package org.team.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class HelloWordController {


    @RequestMapping("/showForm")
    public String showForm() {
        System.out.println("/show");
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        System.out.println("form");
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShouldDude(@RequestParam("studentName") String theName,   Model model){



        theName=theName.toUpperCase();
        String result="Yo!"+theName;



        model.addAttribute("message",result);
        return "helloworld";

    }
}
