package senna.app.Satelites.domain;

import lombok.Data;

@Data
public class Satelite {
    private String id;
    private String description;
    private byte[] image;

    public Satelite(String id, String description, byte[] image) {
        this.id = id;
        this.description = description;
        this.image = image;
    }
}
