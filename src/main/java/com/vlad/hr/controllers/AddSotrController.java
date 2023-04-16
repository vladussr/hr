package com.vlad.hr.controllers;

import com.vlad.hr.models.Persons;
import com.vlad.hr.repo.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

@Controller
public class AddSotrController {
    @GetMapping("/addsotr")
    public String addsotr(Model model){
        return "addsotr";
    }

    @Autowired
    private PersonsRepository personsRepository;

    @PostMapping("/addsotr")
            public String addSotrPost(@RequestParam String name,
                                      @RequestParam String birthday,
                                      @RequestParam String tax,
                                      @RequestParam String snils,
                                      @RequestParam String pasNumber,
                                      @RequestParam String kemVidPas,
                                      @RequestParam String adress,
                                      @RequestParam String position,
                                      Model model){
        Persons persons = new Persons(name, birthday, tax, snils, pasNumber, kemVidPas, adress, position);
        personsRepository.save(persons);
            return "redirect:/addsotr";
            }

}
