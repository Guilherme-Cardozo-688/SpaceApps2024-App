package senna.app.Cometa.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.stereotype.Service;
import senna.app.Cometa.domain.Cometa;
import senna.app.Cometa.repository.CometaRepository;

import java.io.IOException;
import java.util.List;

@Service
public class CometaService {
    
    private final ObjectMapper objectMapper;

    public CometaService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public List<Cometa> getCometas() {
        try {
            return objectMapper.readValue(
                CometaRepository.COMETA_JSON,
                new TypeReference<List<Cometa>>() {}
            );
        } catch (IOException e) {
            throw new RuntimeException("Erro ao parsear JSON de cometas", e);
        }
    }
}
