package com.example.inventaire.controllers;
import com.example.inventaire.Service.TracePretService;
import com.example.inventaire.entities.TracePret;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trace-prets")
public class TracePretController {
    
    private final TracePretService tracePretService;
    
    
    public TracePretController(TracePretService tracePretService) {
        this.tracePretService = tracePretService;
    }
    
    @GetMapping
    public List<TracePret> getAllTracePrets() {
        return tracePretService.getAllTracePrets();
    }
    
    @PostMapping
    public TracePret createTracePret(@RequestBody TracePret tracePret) {
        return tracePretService.createTracePret(tracePret);
    }
    
    @GetMapping("/{id}")
    public TracePret getTracePretById(@PathVariable Long id) {
        return tracePretService.getTracePretById(id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteTracePret(@PathVariable Long id) {
        tracePretService.deleteTracePret(id);
    }
}