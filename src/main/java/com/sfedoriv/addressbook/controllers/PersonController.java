package com.sfedoriv.addressbook.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class PersonController {
    private final PersonService personService;
}
