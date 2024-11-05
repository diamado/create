package com.example.inventaire.controllers;

import com.example.inventaire.Service.RapportService;
import com.example.inventaire.entities.Rapport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rapports")
public class RapportController {

    @Autowired
    private RapportService rapportService;

    @GetMapping
    public List<Rapport> getAllRapports() {
        return rapportService.getAllRapports();
    }

    @GetMapping("/{id}")
    public Rapport getRapportById(@PathVariable Long id) {
        return rapportService.getRapportById(id);
    }

    @PostMapping
    public Rapport saveRapport(@RequestBody Rapport rapport) {
        return rapportService.saveRapport(rapport);
    }

    @DeleteMapping("/{id}")
    public void deleteRapport(@PathVariable Long id) {
        rapportService.deleteRapport(id);
    }
}