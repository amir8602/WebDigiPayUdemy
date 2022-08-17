package org.team.controllers.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book/rest")
public class BookRestController {


    @GetMapping(value = "/get/{id}",  produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getBook(@PathVariable Long id){
        System.out.println(id);
        return new Book("A","A",1l);
    }


    @PostMapping("/book")
    public void createBook(@RequestBody Book book){
        System.out.println(book);
    }

}
