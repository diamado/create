package com.example.Repository;

import com.example.inventaire.entities.TracePret;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TracePretRepository extends JpaRepository<TracePret, Long> {
    
}