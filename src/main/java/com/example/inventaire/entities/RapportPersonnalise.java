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

public class RapportPersonnalise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(name = "Nom")
    private String nom;
    @Column(name = "Type_Rapport")
    private String typeRapport;
    @Column(name = "Description")
    private String description;
    @Column(name = "Date_Creation")
    private Date dateCreation;
    @Column(name = "Date_Mise_Ajour")
    private Date dateMiseAjour;
    @Column(name = "Continu")
    private String continu;

     @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    
}
