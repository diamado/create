package com.example.inventaire.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.inventaire.Service.MaterielService;
import com.example.inventaire.entities.Materiel;

import java.util.List;

@RestController
@RequestMapping("/materiels")
public class MaterielController {

    @Autowired
    private MaterielService materielService;

    @GetMapping
    public List<Materiel> getAllMateriels() {
        return materielService.getAllMateriels();
    }

    @GetMapping("/{id}")
    public Materiel getMaterielById(@PathVariable Long id) {
        return materielService.getMaterialById(id);
    }

    @PostMapping
    public Materiel saveMateriel(@RequestBody Materiel materiel) {
        return materielService.saveMateriel(materiel);
    }

    @PutMapping("/{id}")
    /*public Materiel updateMateriel(@PathVariable Long id, @RequestBody Materiel updatedMateriel) {
      //  return materielService.updateMateriel(id, updatedMateriel);
    }*/

    @DeleteMapping("/{id}")
    public void deleteMateriel(@PathVariable Long id) {
        materielService.deleteMateriel(id);
    }

    // Ajoutez d'autres endpoints au besoin pour les opérations CRUD et métier sur les Matériels
}