package com.vlad.hr.controllers;

import com.vlad.hr.models.Persons;
import com.vlad.hr.repo.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpisokController {

    @Autowired
    private PersonsRepository personsRepository;

    @GetMapping("/spisoksotr")
    public String koldog(Model model){
        Iterable<Persons> persons = personsRepository.findAll();
        model.addAttribute("persons",persons);
        return "spisoksotr";
    }
}
