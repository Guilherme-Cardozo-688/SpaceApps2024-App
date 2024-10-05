package senna.app.Cometa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import senna.app.Cometa.app.CometaService;
import senna.app.Cometa.domain.Cometa;

@RestController
@RequestMapping("/Comentas")
public class CometaController {
    @Autowired
    private CometaService cometaService;

    @GetMapping
    public List<Cometa> getCometas() {
        return cometaService.getCometas();
    }
}
