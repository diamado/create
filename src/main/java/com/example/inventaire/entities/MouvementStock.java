package com.example.inventaire.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id; 
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
public class MouvementStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Type_Mouvement")
    private String typeMouvement;
    @Column(name = "Date_Mouvement")
    private Date dateMouvement;
    @Column(name = "Quantite")
    private String quantite;
    @Column(name = "Description")
    private String description;

    
     @OneToMany(mappedBy = "mouvementStock")
    private List<RapportMouvement> rapportsMouvement;

    
}
