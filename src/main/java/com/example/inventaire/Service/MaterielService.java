package com.example.inventaire.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.MaterielRepository;
import com.example.inventaire.entities.Materiel;

import java.util.List;

@Service
public class MaterielService {

    @Autowired
    private MaterielRepository materielRepository;

    public List<Materiel> getAllMateriels() {
        return materielRepository.findAll();
    }

    public Materiel getMaterialById(Long id) {
        return materielRepository.findById(id).orElse(null);
    }

    public Materiel saveMateriel(Materiel material) {
        return materielRepository.save(material);
    }

    public void deleteMateriel(Long id) {
        materielRepository.deleteById(id);
    }

    
}