package com.example.inventaire.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventaire.Service.DepartementService;
import com.example.inventaire.entities.Departement;


@RestController
@RequestMapping("/departements")
public class DepartementController {
     @Autowired
    private DepartementService departementService;

    @GetMapping("/{id}")
    public Departement getDepartementById(@PathVariable Long id) {
        return departementService.getDepartementById(id);
    }
    
}
