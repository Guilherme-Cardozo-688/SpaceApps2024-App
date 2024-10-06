package senna.app.Satelites.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import senna.app.Satelites.app.SateliteService;
import senna.app.Satelites.domain.Satelite;

@RestController
@RequestMapping("/satelites")
public class SateliteController {
    private final SateliteService sateliteService;

    public SateliteController(SateliteService sateliteService) {
        this.sateliteService = sateliteService;
    }

    @GetMapping("/{id}")
    public Optional<Satelite> getSateliteById(@PathVariable String id) {
        return sateliteService.getSateliteById(id);
    
}}
