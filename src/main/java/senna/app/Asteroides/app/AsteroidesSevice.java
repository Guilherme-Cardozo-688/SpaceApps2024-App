package senna.app.Asteroides.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.stereotype.Service;
import senna.app.Asteroides.domain.Asteroides;
import senna.app.Asteroides.repository.AsteroidedRepository;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Service
public class AsteroidesSevice {
    
    private final ObjectMapper objectMapper;

    public AsteroidesSevice(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public List<Asteroides> getAsteroides() {
        try {
            Map<String, List<Asteroides>> asteroideMap = objectMapper.readValue(
                AsteroidedRepository.ASTEROIDES_JSON,
                new TypeReference<Map<String, List<Asteroides>>>() {}
            );
            return asteroideMap.get("asteroides");
        } catch (IOException e) {
            throw new RuntimeException("Erro ao parsear JSON de asteroides", e);
        }
    }
}
