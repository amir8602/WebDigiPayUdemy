package org.team.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.team.Time;

@Controller
@RequestMapping("/time")
public class TimeController {

    @GetMapping("/getTime")
    public String getForm(){
        System.out.println("form");
        return "time";

    }

    @PostMapping("/showTime")
    public String transferData(Time time){
        System.out.printf("%s:%s",time.getHour(),time.getMinute());
        return "redirect:/time/getTime";
    }
}
