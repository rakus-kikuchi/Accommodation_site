package com.example.accommodationsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HotelController {

    @GetMapping("/top")
    public String view(){
        return "hotel/view";
    }

}
