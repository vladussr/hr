package com.vlad.hr.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.service.annotation.GetExchange;

@Controller
public class KoldogController {
    @GetMapping("/koldog")
    public String koldog(Model model){
        return "koldog";
    }
}
