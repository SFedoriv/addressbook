package com.sfedoriv.addressbook.controllers;

import com.sfedoriv.addressbook.repositories.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class PersonController {
        private final PersonRepository personRepository;

    @RequestMapping("/persons")
    public String getPersons(Model model) {
        model.addAttribute(personRepository.findAll());
        return "persons";
    }
}
