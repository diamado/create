package com.example.Repository;

import com.example.inventaire.entities.RapportPersonnalise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RapportPersonnaliseRepository extends JpaRepository<RapportPersonnalise, Long> {
    
}