package com.example.Flipkartms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WomenCloths {
    @GetMapping("/mycloths")
    public String getData(){
        return "Please book your  Flight ticket, Choose Your Fav Airlines Idigo";
    }

}
