package com.example.inventaire.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.RapportMouvementRepository;
import com.example.inventaire.entities.RapportMouvement;

@Service
public class RapportMouvementService {

    @Autowired
    private RapportMouvementRepository rapportMouvementRepository;

    public List<RapportMouvement> getAllRapportsMouvement() {
        return rapportMouvementRepository.findAll();
    }

    public RapportMouvement getRapportMouvementById(Long id) {
        return rapportMouvementRepository.findById(id).orElse(null);
    }

    public RapportMouvement saveRapportMouvement(RapportMouvement rapportMouvement) {
        return rapportMouvementRepository.save(rapportMouvement);
    }

    public void deleteRapportMouvement(Long id) {
        rapportMouvementRepository.deleteById(id);
    }
}