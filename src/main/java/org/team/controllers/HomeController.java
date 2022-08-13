package org.team.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller

@RequestMapping("/")

public class HomeController {

    @GetMapping("/")
    public String getHome(){
        System.out.println("get");
        return "index";
    }

//    @PostMapping()
//    public String postHome(){
//        System.out.println("post");
//        return "index";
//    }
//    @DeleteMapping()
//    public String deleteHome(){
//        System.out.println("delete");
//        return "index";
//    }
//    @PutMapping()
//    public String putHome(){
//        System.out.println("put");
//        return "index";
//    }
}
