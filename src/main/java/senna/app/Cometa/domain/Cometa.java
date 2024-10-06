package senna.app.Cometa.domain;

import lombok.Data;

@Data
public class Cometa {
    private String id;
    private String description;
    private byte[] imageBlob;

    public Cometa(String id, String description, byte[] imageBlob) {
        this.id = id;
        this.description = description;
        this.imageBlob = imageBlob;
    }
}
