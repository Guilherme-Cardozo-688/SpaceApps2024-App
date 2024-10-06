package senna.app.Cometa.app;

import org.springframework.stereotype.Service;
import senna.app.Cometa.domain.Cometa;
import senna.app.Cometa.repository.CometaRepository;

import java.util.Optional;

@Service
public class CometaService {
    public Optional<Cometa> getCometaById(String id) {
        return CometaRepository.COMETAS.stream()
                                       .filter(cometa -> cometa.getId().equals(id))
                                       .findFirst();
    }
}
