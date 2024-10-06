package senna.app.Planeta.app;

import java.util.Optional;

import org.springframework.stereotype.Service;

import senna.app.Planeta.domain.Planeta;
import senna.app.Planeta.repository.PlanetaRepository;

@Service
public class PlanetaService {
   public Optional<Planeta> getPlanetaById(String id) {
        return PlanetaRepository.PLANETAS.stream()
                                       .filter(planeta -> planeta.getId().equals(id))
                                       .findFirst();
    }
}