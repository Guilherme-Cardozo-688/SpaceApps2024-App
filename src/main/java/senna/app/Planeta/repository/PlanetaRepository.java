package senna.app.Planeta.repository;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import senna.app.Planeta.domain.Planeta;

public class PlanetaRepository {
    public static final List<Planeta> PLANETAS = new ArrayList<>();

    static {
        try {
            PLANETAS.add(new Planeta(
                "Mercury", 
                "Mercury is the closest planet to the Sun and the smallest in the solar system. It has a thin atmosphere and is heavily cratered.", 
                loadImageBlob("src/main/resources/images/planeta/Mercurio.jpg")
            ));
            
            PLANETAS.add(new Planeta(
                "Venus", 
                "Venus is the second planet from the Sun and has a thick atmosphere rich in carbon dioxide, resulting in an extreme greenhouse effect.", 
                loadImageBlob("src/main/resources/images/planeta/Venus.png")
            ));
            
            PLANETAS.add(new Planeta(
                "Earth", 
                "Earth is the third planet from the Sun and the only known planet to support life. It has a diverse climate, oceans, and atmosphere.", 
                loadImageBlob("src/main/resources/images/planeta/Terra.png")
            ));
            
            PLANETAS.add(new Planeta(
                "Mars", 
                "Mars is the fourth planet from the Sun and is often called the 'Red Planet' due to its reddish appearance caused by iron oxide on its surface.", 
                loadImageBlob("src/main/resources/images/planeta/Marte.png")
            ));
            
            PLANETAS.add(new Planeta(
                "Jupiter", 
                "Jupiter is the largest planet in the solar system, with a massive atmosphere mostly of hydrogen and helium. It has a strong magnetic field and many moons.", 
                loadImageBlob("src/main/resources/images/planeta/Jupiter.jpg")
            ));
            
            PLANETAS.add(new Planeta(
                "Saturn", 
                "Saturn is the sixth planet from the Sun and is best known for its extensive ring system. It is a gas giant with numerous moons.", 
                loadImageBlob("src/main/resources/images/planeta/Saturno.jpg")
            ));
            
            PLANETAS.add(new Planeta(
                "Uranus", 
                "Uranus is the seventh planet from the Sun and has a unique tilt, rotating on its side. It has a faint ring system and a methane-rich atmosphere.", 
                loadImageBlob("src/main/resources/images/planeta/Urano.png")
            ));
            
            PLANETAS.add(new Planeta(
                "Neptune", 
                "Neptune is the eighth planet from the Sun and is known for its deep blue color, caused by methane in its atmosphere. It has strong winds and many moons.", 
                loadImageBlob("src/main/resources/images/planeta/Netuno.jpg")
            ));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static byte[] loadImageBlob(String imagePath) throws IOException {
        return Files.readAllBytes(Paths.get(imagePath));
    }
}
