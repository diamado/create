package com.example.inventaire.entities;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

public class TracePret {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Date datePret;
    private Date dateRetour;
    
    
    @ManyToOne
    private Materiel materiel;
    @ManyToOne
    private Employe employe;



    
}
