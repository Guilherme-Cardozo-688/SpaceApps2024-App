package senna.app.Planeta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import senna.app.Planeta.app.PlanetaService;
import senna.app.Planeta.domain.Planeta;

@RestController
@RequestMapping("/planetas")
public class PlanetaController {
    private final PlanetaService planetaService;

    @Autowired
    public PlanetaController(PlanetaService planetaService) {
        this.planetaService = planetaService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Planeta> getPlanetaById(@PathVariable String id) {
        return planetaService.getPlanetaById(id)
                            .map(ResponseEntity::ok)
                            .orElse(ResponseEntity.notFound().build());
    }
}