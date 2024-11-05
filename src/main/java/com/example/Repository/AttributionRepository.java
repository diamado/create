package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.inventaire.entities.Attribution;

public interface AttributionRepository extends JpaRepository<Attribution, Long> {
    
}