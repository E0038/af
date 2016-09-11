package org.e38.af.model;

import javax.persistence.*;

@Entity
public class Group {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @OneToOne
    private Horari horari;
    private String nom;

    public String getNom() {
        return nom;
    }

    public Group setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public Horari getHorari() {
        return horari;
    }

    public Group setHorari(Horari horari) {
        this.horari = horari;
        return this;
    }

    public Long getId() {
        return id;
    }
}
