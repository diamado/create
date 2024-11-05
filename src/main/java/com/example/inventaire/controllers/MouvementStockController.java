package com.example.inventaire.controllers;

import com.example.inventaire.Service.MouvementStockService;
import com.example.inventaire.entities.MouvementStock;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mouvements-stock")
public class MouvementStockController {
    
    private final MouvementStockService mouvementStockService;
    
    
    public MouvementStockController(MouvementStockService mouvementStockService) {
        this.mouvementStockService = mouvementStockService;
    }
    
    @GetMapping
    public List<MouvementStock> getAllMouvementsStock() {
        return mouvementStockService.getAllMouvementsStock();
    }
    
    @PostMapping
    public MouvementStock createMouvementStock(@RequestBody MouvementStock mouvementStock) {
        return mouvementStockService.createMouvementStock(mouvementStock);
    }
    
    @GetMapping("/{id}")
    public MouvementStock getMouvementStockById(@PathVariable Long id) {
        return mouvementStockService.getMouvementStockById(id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteMouvementStock(@PathVariable Long id) {
        mouvementStockService.deleteMouvementStock(id);
    }
}