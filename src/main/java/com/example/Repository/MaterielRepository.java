package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.inventaire.entities.Materiel;

public interface MaterielRepository extends JpaRepository<Materiel, Long> {
    
}