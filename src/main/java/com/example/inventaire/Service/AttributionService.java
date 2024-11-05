package com.example.inventaire.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.AttributionRepository;
import com.example.inventaire.entities.Attribution;
@Service
public class AttributionService {
      @Autowired
    private AttributionRepository attributionRepository;

    
    public Attribution ajouterAttribution(Attribution attribution) {
        return attributionRepository.save(attribution);
    }
    
}
