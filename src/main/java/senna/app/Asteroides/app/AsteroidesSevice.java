package senna.app.Asteroides.app;

import java.util.Optional;
import org.springframework.stereotype.Service;
import senna.app.Asteroides.domain.Asteroides;
import senna.app.Asteroides.repository.AsteroidedRepository;

@Service
public class AsteroidesSevice {
    
    public Optional<Asteroides> getAsteroidesById(String id) {
        return AsteroidedRepository.ASTEROIDES.stream()
                                       .filter(asteroide -> asteroide.getId().equals(id))
                                       .findFirst();
    }
}
