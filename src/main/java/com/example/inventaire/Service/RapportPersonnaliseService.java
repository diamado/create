package com.example.inventaire.Service;

import com.example.Repository.RapportPersonnaliseRepository;
import com.example.inventaire.entities.RapportPersonnalise;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RapportPersonnaliseService {
    
    private final RapportPersonnaliseRepository rapportPersonnaliseRepository;
    
    
    public RapportPersonnaliseService(RapportPersonnaliseRepository rapportPersonnaliseRepository) {
        this.rapportPersonnaliseRepository = rapportPersonnaliseRepository;
    }
    
    public List<RapportPersonnalise> getAllRapportsPersonnalises() {
        return rapportPersonnaliseRepository.findAll();
    }
    
    public RapportPersonnalise createRapportPersonnalise(RapportPersonnalise rapportPersonnalise) {
        return rapportPersonnaliseRepository.save(rapportPersonnalise);
    }
    
    public RapportPersonnalise getRapportPersonnaliseById(Long id) {
        return rapportPersonnaliseRepository.findById(id).orElse(null);
    }
    
    public void deleteRapportPersonnalise(Long id) {
        rapportPersonnaliseRepository.deleteById(id);
    }
}