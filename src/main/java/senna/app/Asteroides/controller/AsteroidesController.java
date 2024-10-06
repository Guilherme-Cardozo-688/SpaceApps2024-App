package senna.app.Asteroides.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import senna.app.Asteroides.app.AsteroidesSevice;
import senna.app.Asteroides.domain.Asteroides;
import senna.app.Cometa.app.CometaService;
import senna.app.Cometa.domain.Cometa;

@RestController
@RequestMapping("/asteroides")
public class AsteroidesController {
    
    private final AsteroidesSevice asteroidesSevice;

    @Autowired
    public AsteroidesController(AsteroidesSevice asteroidesSevice) {
        this.asteroidesSevice = asteroidesSevice;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Asteroides> getAsteroideById(@PathVariable String id) {
        return asteroidesSevice.getAsteroidesById(id)
                               .map(ResponseEntity::ok)
                               .orElse(ResponseEntity.notFound().build());
    }
}
