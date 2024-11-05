package com.example.inventaire.Service;
import org.springframework.stereotype.Service;
import com.example.Repository.EmployeRepository;
import com.example.inventaire.entities.Employe;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeService {

    private EmployeRepository employeRepository;

    
    public EmployeService(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    public List<Employe> getAllEmployes() {
        return employeRepository.findAll();
    }

    public Employe getEmployeById(Long id) {
        Optional<Employe> employe = employeRepository.findById(id);
        return employe.orElse(null);
    }

    public Employe saveEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    public void deleteEmploye(Long id) {
        employeRepository.deleteById(id);
    }
}