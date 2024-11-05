package com.example.inventaire.Service;

import com.example.Repository.RapportRepository;
import com.example.inventaire.entities.Rapport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RapportService {

    @Autowired
    private RapportRepository rapportRepository;
   
    public List<Rapport> getAllRapports() {
        return rapportRepository.findAll();
    }

    public Rapport getRapportById(Long id) {
        return rapportRepository.findById(id).orElse(null);
    }

    public Rapport saveRapport(Rapport rapport) {
        return rapportRepository.save(rapport);
    }

    public void deleteRapport(Long id) {
        rapportRepository.deleteById(id);
    }
}