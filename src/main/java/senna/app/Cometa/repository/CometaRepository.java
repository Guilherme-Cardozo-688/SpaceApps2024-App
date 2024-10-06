package senna.app.Cometa.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import senna.app.Cometa.domain.Cometa;

@Repository
public class CometaRepository {
    public static final List<Cometa> COMETAS = new ArrayList<>();

    static {
        try {
            COMETAS.add(new Cometa("9P", "9P/Tempel 1 is a periodic comet known for its visit by the Deep Impact mission in 2005, which impacted the comet to study its composition and structure.", loadImageBlob("src/main/resources/images/cometa/Tempel1.jpg")));
            COMETAS.add(new Cometa("73P", "description: 73P/Schwassmann-Wachmann 3 is a periodic comet that is known for its fragmentation into multiple pieces, making it a subject of interest for study", loadImageBlob("src/main/resources/images/cometa/Schwassmann-Wachmann.jpg")));
            COMETAS.add(new Cometa("81P", "81P/Wild is a periodic comet that was visited by the European Space Agency's Giotto spacecraft, which provided valuable data on its composition.", loadImageBlob("src/main/resources/images/cometa/Wild.jpg")));
            COMETAS.add(new Cometa("Borrelly", "Borrelly is a periodic comet known for its close approach to Earth and was visited by the Deep Space 1 spacecraft in 2001.", loadImageBlob("src/main/resources/images/cometa/Borrelly.png")));
            COMETAS.add(new Cometa("67P", "67P/Churyumov-Gerasimenko is a periodic comet that was visited by the European Space Agency's Rosetta mission, which provided extensive data on its surface and environment.", loadImageBlob("src/main/resources/images/cometa/Churyumov_Gerasimenko.jpg")));
            COMETAS.add(new Cometa("103P", "103P/Hartley is a periodic comet that was visited by the Deep Impact mission in 2010, which revealed its irregular shape and surface features.", loadImageBlob("src/main/resources/images/cometa/Hartley.jpg")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static byte[] loadImageBlob(String imagePath) throws IOException {
        return Files.readAllBytes(Paths.get(imagePath));
    }
}
