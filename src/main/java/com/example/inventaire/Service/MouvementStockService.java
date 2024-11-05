package com.example.inventaire.Service;

import com.example.Repository.MouvementStockRepository;
import com.example.inventaire.entities.MouvementStock;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MouvementStockService {
    
    private final MouvementStockRepository mouvementStockRepository;
    
    
    public MouvementStockService(MouvementStockRepository mouvementStockRepository) {
        this.mouvementStockRepository = mouvementStockRepository;
    }
    
    public List<MouvementStock> getAllMouvementsStock() {
        return mouvementStockRepository.findAll();
    }
    
    public MouvementStock createMouvementStock(MouvementStock mouvementStock) {
        return mouvementStockRepository.save(mouvementStock);
    }
    
    public MouvementStock getMouvementStockById(Long id) {
        return mouvementStockRepository.findById(id).orElse(null);
    }
    
    public void deleteMouvementStock(Long id) {
        mouvementStockRepository.deleteById(id);
    }
}