package senna.app.Satelites.app;
	
import java.util.Optional;

import org.springframework.stereotype.Service;

import senna.app.Satelites.domain.Satelite;
import senna.app.Satelites.repository.SateliteRepository;

@Service
public class SateliteService {
    public Optional<Satelite> getSateliteById(String id) {
        return SateliteRepository.SATELITES.stream()
                                       .filter(satelite -> satelite.getId().equals(id))
                                       .findFirst();
    }
}
