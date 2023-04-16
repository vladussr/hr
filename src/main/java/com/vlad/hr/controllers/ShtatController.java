package com.vlad.hr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShtatController {
    @GetMapping("/shtat")
    public String koldog(Model model){
        return "shtat";
    }
}
