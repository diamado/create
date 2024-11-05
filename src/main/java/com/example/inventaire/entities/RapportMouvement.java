package com.example.inventaire.entities;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor

public class RapportMouvement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Type_Rapport")
    private String typeRapport;
    @Column(name = "Description")
    private String description;
    @Column(name = "Date_Debut")
    private Date dateDebut;
    @Column(name="Date_Fin")
    private Date dateFin;
    @Column(name = "Details")
    private String details;
    
    @ManyToMany
    private Set<Materiel> materiel; 
     @ManyToOne
    @JoinColumn(name = "mouvement_stock_id")
    private MouvementStock mouvementStock;

    
}
