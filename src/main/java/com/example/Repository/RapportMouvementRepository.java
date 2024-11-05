package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.inventaire.entities.RapportMouvement;


public interface RapportMouvementRepository extends JpaRepository<RapportMouvement, Long> {
    
}