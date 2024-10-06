package senna.app.Satelites.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import senna.app.Satelites.domain.Satelite;

public class SateliteRepository {
    public static final List<Satelite> SATELITES = new ArrayList<>();

    static {
        try {
            SATELITES.add(new Satelite( "Lucy", "Lucy is a NASA mission designed to explore the Trojan asteroids of Jupiter, giving insights into the early solar system by studying these ancient remnants.", loadImageBlob("src/main/resources/images/satelite/Lucy.png")));
            SATELITES.add(new Satelite( "OSIRIS_APEX", "OSIRIS-APEX is the new phase of the OSIRIS-REx mission after successfully returning samples from asteroid Bennu. Now, it will continue its journey to explore the asteroid Apophis in 2029.", loadImageBlob("src/main/resources/images/satelite/OsirisApex.jpg")));
            SATELITES.add(new Satelite( "Psyche", "Psyche is an upcoming NASA mission aimed at studying the metallic asteroid 16 Psyche. It seeks to understand more about planetary cores and the formation of rocky planets.", loadImageBlob("src/main/resources/images/satelite/Psyche.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static byte[] loadImageBlob(String imagePath) throws IOException {
        return Files.readAllBytes(Paths.get(imagePath));
    }
}
