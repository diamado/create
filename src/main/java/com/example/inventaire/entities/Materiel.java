package com.example.inventaire.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity

@Data
@Table
@NoArgsConstructor
@AllArgsConstructor

public class Materiel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nom")
    private String nom;
    @Column(name = "Description")
    private String description;
    @Column(name = "Quantite")
    private String quantite;
       @Enumerated(EnumType.STRING)
    private CategorieType categorieType;

    @ManyToOne
    private Departement departement;
    @OneToMany(mappedBy = "materiel")
    private List<RapportMouvement> rapportsMouvement;
    @OneToMany(mappedBy = "materiel")
    private List<Attribution> attributions;
     @ManyToOne
    @JoinColumn(name = "IdUtilisateur ")
    private Utilisateur utilisateur;
    
}