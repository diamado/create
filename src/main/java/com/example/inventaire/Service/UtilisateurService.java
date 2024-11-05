package com.example.inventaire.Service;

import com.example.Repository.UtilisateurRepository;
import com.example.inventaire.entities.Utilisateur;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {
    
    private final UtilisateurRepository utilisateurRepository;
    
    
    public UtilisateurService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }
    
    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurRepository.findAll();
    }
    
    public Utilisateur createUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }
    
    public Utilisateur getUtilisateurById(Long id) {
        return utilisateurRepository.findById(id).orElse(null);
    }
    
    public void deleteUtilisateur(Long id) {
        utilisateurRepository.deleteById(id);
    }
}