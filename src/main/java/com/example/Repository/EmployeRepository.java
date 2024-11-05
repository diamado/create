package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.inventaire.entities.Employe;


public interface EmployeRepository extends JpaRepository<Employe, Long> {
    
}
