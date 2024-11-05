package com.example.inventaire.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.inventaire.Service.RapportMouvementService;
import com.example.inventaire.entities.RapportMouvement;

import java.util.List;

@RestController
@RequestMapping("/rapports-mouvement")
public class RapportMouvementController {

    @Autowired
    private RapportMouvementService rapportMouvementService;

    @GetMapping
    public List<RapportMouvement> getAllRapportsMouvement() {
        return rapportMouvementService.getAllRapportsMouvement();
    }

    @GetMapping("/{id}")
    public RapportMouvement getRapportMouvementById(@PathVariable Long id) {
        return rapportMouvementService.getRapportMouvementById(id);
    }

    @PostMapping
    public RapportMouvement createRapportMouvement(@RequestBody RapportMouvement rapportMouvement) {
        return rapportMouvementService.saveRapportMouvement(rapportMouvement);
    }

    @PutMapping("/{id}")
    public RapportMouvement updateRapportMouvement(@PathVariable Long id, @RequestBody RapportMouvement rapportMouvement) {
        rapportMouvement.setId(id); 
        return rapportMouvementService.saveRapportMouvement(rapportMouvement);
    }

    @DeleteMapping("/{id}")
    public void deleteRapportMouvement(@PathVariable Long id) {
        rapportMouvementService.deleteRapportMouvement(id);
    }
}