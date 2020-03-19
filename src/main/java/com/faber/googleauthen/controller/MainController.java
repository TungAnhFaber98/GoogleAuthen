package com.faber.googleauthen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author TungAnhFaber
 */

@RestController
public class MainController {
   
    @GetMapping("/")
    public String helloWorld(){
        return "Hello World";
    }
    
     @GetMapping("/restricted")
    public String restricteds(){
        return "to see this text you need to be logged in";
    }
}
