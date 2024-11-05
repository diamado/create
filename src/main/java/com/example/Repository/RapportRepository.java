package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.inventaire.entities.Rapport;

public interface RapportRepository  extends JpaRepository<Rapport, Long>{
    
}
