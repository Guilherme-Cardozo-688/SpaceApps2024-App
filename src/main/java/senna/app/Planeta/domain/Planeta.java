package senna.app.Planeta.domain;

import lombok.Data;

@Data
public class Planeta {
    private String id;
    private String descricao;
    private byte[] imagem;

    public Planeta(String id, String descricao, byte[] imagem) {
        this.id = id;
        this.descricao = descricao;
        this.imagem = imagem;
    }
}
