package senna.app.Asteroides.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import senna.app.Asteroides.domain.Asteroides;

@Repository
public class AsteroidedRepository {

    public static final List<Asteroides> ASTEROIDES = new ArrayList<>();

    static {
        try {
            ASTEROIDES.add(new Asteroides("617", "617 Pátroclo is a large Jupiter trojan asteroid, orbiting in Jupiter's L5 Lagrangian point. It is part of a binary system with its companion, Menoetius. Pátroclo is unique due to its large size and binary nature.", loadImageBlob("src/main/resources/images/asteroides/Patroclus.png")));
            ASTEROIDES.add(new Asteroides("243", "243 Ida is a large asteroid located in the asteroid belt. It is notable for being the first asteroid discovered to have a moon, Dactyl. Ida has a relatively low albedo and a surface marked by impact craters.", loadImageBlob("src/main/resources/images/asteroides/Ida.jpg")));
            ASTEROIDES.add(new Asteroides("16", "16 Psique is a large metallic asteroid located in the asteroid belt. It is believed to be composed mainly of iron and nickel, similar to Earth's core. Psique is unique because it is thought to be a remnant of a protoplanet, and it is one of the largest asteroids in the belt.", loadImageBlob("src/main/resources/images/asteroides/Psique.jpg")));
            ASTEROIDES.add(new Asteroides("9969", "9969 Braille is a binary asteroid located in the main asteroid belt. It is named after Louis Braille, the inventor of Braille, a system for reading and writing used by the visually impaired. The asteroid has a small companion moon, which makes it a unique object for study.", loadImageBlob("src/main/resources/images/asteroides/Braille.jpg")));
            ASTEROIDES.add(new Asteroides("152830", "152830 Dinkinesh is a relatively small asteroid located in the main belt, named after the Ethiopian word for 'human'. It is notable for its irregular shape and surface features.", loadImageBlob("src/main/resources/images/asteroides/Dinkinesh.png")));
            ASTEROIDES.add(new Asteroides("951", "951 Gaspra is a small asteroid located in the asteroid belt, known for its irregular shape and as the first asteroid to be visited by a spacecraft, during the Galileo mission.", loadImageBlob("src/main/resources/images/asteroides/Gaspra.jpg")));
            ASTEROIDES.add(new Asteroides("21900", "21900 Orus is a relatively small asteroid in the main belt. It has a low albedo and a dark surface, typical of carbonaceous asteroids.", loadImageBlob("src/main/resources/images/asteroides/Orus.jpg")));
            ASTEROIDES.add(new Asteroides("11351", "11351 Leucus is a medium-sized asteroid located in the asteroid belt. It is named after a character from Greek mythology and has been studied for its surface composition.", loadImageBlob("src/main/resources/images/asteroides/Leucus.jpg")));
            ASTEROIDES.add(new Asteroides("253", "253 Mathilde is a large asteroid located in the asteroid belt. It is notable for its low density and irregular shape, and it was visited by the NEAR spacecraft.", loadImageBlob("src/main/resources/images/asteroides/Mathilde.jpg")));
            ASTEROIDES.add(new Asteroides("3548", "3548 Eurybates is a large asteroid located in the main belt, known for its binary nature, having a companion moon.", loadImageBlob("src/main/resources/images/asteroides/Eurybates.jpg")));
            ASTEROIDES.add(new Asteroides("15094", "15094 Polymele is a binary asteroid located in the outer asteroid belt, known for its complex orbit and physical characteristics.", loadImageBlob("src/main/resources/images/asteroides/Polymele.jpg")));
            ASTEROIDES.add(new Asteroides("162173", "162173 Ryugu is a near-Earth asteroid that was visited by the Hayabusa2 mission. It is a C-type asteroid with a rubble-pile structure.", loadImageBlob("src/main/resources/images/asteroides/Ryugu.jpg")));
            ASTEROIDES.add(new Asteroides("52246", "52246 Donald Johanson is an asteroid named after the anthropologist who discovered the famous 'Lucy' fossil.", loadImageBlob("src/main/resources/images/asteroides/Donald.jpg")));
            ASTEROIDES.add(new Asteroides("25143", "25143 Itokawa is a small near-Earth asteroid that was visited by the Hayabusa mission. It is known for its peanut-like shape.", loadImageBlob("src/main/resources/images/asteroides/Itokawa.jpg")));
            ASTEROIDES.add(new Asteroides("4", "4 Vesta is one of the largest asteroids in the asteroid belt and has been studied extensively due to its geological features and composition.", loadImageBlob("src/main/resources/images/asteroides/Vesta.jpg")));
            ASTEROIDES.add(new Asteroides("99942", "99942 Apófis is a near-Earth asteroid known for its potential risk of impacting Earth. It has a relatively small size but has garnered significant attention.", loadImageBlob("src/main/resources/images/asteroides/Apofis.png")));
            ASTEROIDES.add(new Asteroides("433", "433 Eros is a near-Earth asteroid that was the first asteroid to be orbited by a spacecraft, NEAR Shoemaker. It is one of the largest asteroids in its category.", loadImageBlob("src/main/resources/images/asteroides/Eros.jpeg")));
            ASTEROIDES.add(new Asteroides("5535", "5535 Annefrank is a small asteroid located in the main belt, named in honor of Anne Frank. It is known for its irregular shape.", loadImageBlob("src/main/resources/images/asteroides/Annefrank.png")));
            ASTEROIDES.add(new Asteroides("101955", "101955 Bennu is a near-Earth asteroid that was visited by the OSIRIS-REx mission. It is classified as a potentially hazardous asteroid due to its orbit.", loadImageBlob("src/main/resources/images/asteroides/Bennu.png")));
            ASTEROIDES.add(new Asteroides("21", "21 Lutécia is an asteroid located in the asteroid belt, named after a Celtic tribe in the ancient region of Lutetia.", loadImageBlob("src/main/resources/images/asteroides/Lutetia.jpg")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static byte[] loadImageBlob(String imagePath) throws IOException {
        return Files.readAllBytes(Paths.get(imagePath));
    }
}