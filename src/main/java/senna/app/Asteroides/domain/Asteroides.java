package senna.app.Asteroides.domain;

import lombok.Data;

@Data
public class Asteroides {

    private String id;
    private String description;
    private byte[] imageBlob;

    public Asteroides(String id, String description, byte[] imageBlob) {
        this.id = id;
        this.description = description;
        this.imageBlob = imageBlob;
    }    
}
