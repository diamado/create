package com.example.inventaire.entities;

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

public class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="Nom")
	private String nom;
	@Column(name = "Prenom")
	private String prenom;
	@Column(name = "Adresse")
	private String adresse;

	 @OneToMany(mappedBy = "employe")
    private List<Attribution> attributions;
	
	



}

