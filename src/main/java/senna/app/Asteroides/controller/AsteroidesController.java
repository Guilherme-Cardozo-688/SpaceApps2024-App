package senna.app.Asteroides.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import senna.app.Asteroides.app.AteroidesSevice;
import senna.app.Asteroides.domain.Asteroides;

import java.util.List;

@RestController
@RequestMapping("/asteroides")
public class AsteroidesController {
    
    private final AteroidesSevice ateroidesSevice;

    @Autowired
    public AsteroidesController(AteroidesSevice ateroidesSevice) {
        this.ateroidesSevice = ateroidesSevice;
    }

    @GetMapping
    public List<Asteroides> getAllAsteroides() {
        return ateroidesSevice.getAsteroides();
    }
}
