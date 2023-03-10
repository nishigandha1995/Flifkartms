package com.example.Flipkartms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenCloths {
    @GetMapping("/nishi")
    public String getData(){
        return "Please visit the shop ";
    }

}
