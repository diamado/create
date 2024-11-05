package com.example.inventaire.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Attribution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Date_Attribution")
    private Date dateAttribution;
    @Column(name = "Date_Retour")
    private Date dateRetour;
    @Column(name = "Motif")
    private String motif;

    @ManyToOne
     @JoinColumn(name = "idEmploye")
    private Employe employe;
    @ManyToOne
    @JoinColumn(name = "idMateriel")
    private Materiel materiel;

    
}
