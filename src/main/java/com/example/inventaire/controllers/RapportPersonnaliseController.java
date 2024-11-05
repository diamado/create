package com.example.inventaire.controllers;

import com.example.inventaire.Service.RapportPersonnaliseService;
import com.example.inventaire.entities.RapportPersonnalise;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rapports-personnalises")
public class RapportPersonnaliseController {
    
    private final RapportPersonnaliseService rapportPersonnaliseService;
    
    
    public RapportPersonnaliseController(RapportPersonnaliseService rapportPersonnaliseService) {
        this.rapportPersonnaliseService = rapportPersonnaliseService;
    }
    
    @GetMapping
    public List<RapportPersonnalise> getAllRapportsPersonnalises() {
        return rapportPersonnaliseService.getAllRapportsPersonnalises();
    }
    
    @PostMapping
    public RapportPersonnalise createRapportPersonnalise(@RequestBody RapportPersonnalise rapportPersonnalise) {
        return rapportPersonnaliseService.createRapportPersonnalise(rapportPersonnalise);
    }
    
    @GetMapping("/{id}")
    public RapportPersonnalise getRapportPersonnaliseById(@PathVariable Long id) {
        return rapportPersonnaliseService.getRapportPersonnaliseById(id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteRapportPersonnalise(@PathVariable Long id) {
        rapportPersonnaliseService.deleteRapportPersonnalise(id);
    }
}