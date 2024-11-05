package com.example.inventaire.Service;
import com.example.Repository.TracePretRepository;
import com.example.inventaire.entities.TracePret;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TracePretService {
    
    private final TracePretRepository tracePretRepository;
    
    
    public TracePretService(TracePretRepository tracePretRepository) {
        this.tracePretRepository = tracePretRepository;
    }
    
    public List<TracePret> getAllTracePrets() {
        return tracePretRepository.findAll();
    }
    
    public TracePret createTracePret(TracePret tracePret) {
        return tracePretRepository.save(tracePret);
    }
    
    public TracePret getTracePretById(Long id) {
        return tracePretRepository.findById(id).orElse(null);
    }
    
    public void deleteTracePret(Long id) {
        tracePretRepository.deleteById(id);
    }
}