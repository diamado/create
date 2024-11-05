package com.example.inventaire.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nom")
    private String nom;
    @Column(name = "Prenom")
    private String prenom;
    @Column(name = "Adresse")
    private String adresse;
    @Column(name = "Telephone")
    private String telephone;
    @Column(name = "Email")
    private String email;

    
    
     @ManyToMany
    private Set<Role> roles;
     @OneToMany(mappedBy = "utilisateur")
    private List<Materiel> materiels;
    @OneToMany(mappedBy = "utilisateur")
    private List<RapportPersonnalise> rapportsPersonnalises;

     
    @OneToMany(mappedBy = "utilisateur")
    private List<Rapport> rapports;
}


