package org.team.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class SillyController {
    @RequestMapping("/Form")
    public String displayTheForm(){
        return "helloworld-form";
    }
}
