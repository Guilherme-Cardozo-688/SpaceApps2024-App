package senna.app.Cometa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import senna.app.Cometa.app.CometaService;
import senna.app.Cometa.domain.Cometa;

@RestController
@RequestMapping("/cometas")
public class CometaController {
    
    private final CometaService cometaService;

    @Autowired
    public CometaController(CometaService cometaService) {
        this.cometaService = cometaService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cometa> getCometaById(@PathVariable String id) {
        return cometaService.getCometaById(id)
                            .map(ResponseEntity::ok)
                            .orElse(ResponseEntity.notFound().build());
    }
}