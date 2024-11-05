package com.example.inventaire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.Repository")
public class InventaireApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventaireApplication.class, args);
	}

}
