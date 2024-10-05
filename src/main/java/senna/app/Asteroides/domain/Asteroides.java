package senna.app.Asteroides.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Asteroides {

    @Id
    private String id;
    private String name;
    private double a;
    private double e;
    private double i;
    private double longPeri;
    private double longNode;
    private double n;
    private double t;
    private String description;
    private Boolean pHAs;
    public Asteroides(String id, String name, double a, double e, double i, double longPeri, double longNode, double n, double t, String description, Boolean pHAs) {
        this.id = id;
        this.name = name;
        this.a = a;
        this.e = e;
        this.i = i;
        this.longPeri = longPeri;
        this.longNode = longNode;
        this.n = n;
        this.t = t;
        this.description = description;
        this.pHAs = pHAs;
    }

    
}
