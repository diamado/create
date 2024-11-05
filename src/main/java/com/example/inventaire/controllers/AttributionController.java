package com.example.inventaire.controllers;

import com.example.inventaire.Service.AttributionService;
import com.example.inventaire.entities.Attribution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attributions")
public class AttributionController {

    @Autowired
    private AttributionService attributionService;

    @PostMapping("/ajouter")
    public ResponseEntity<Attribution> ajouterAttribution(@RequestBody Attribution attribution) {
        Attribution newAttribution = attributionService.ajouterAttribution(attribution);
        return ResponseEntity.ok(newAttribution);
    }

    
}