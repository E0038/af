package org.e38.af.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by sergi on 9/10/16.
 */
@Entity
public class Modul {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    @OneToMany
    private List<UF> ufs;
    @Embedded
    private Periode periodValid;

    public long getId() {
        return id;
    }

    public Modul setId(long id) {
        this.id = id;
        return this;
    }

    public String getNom() {
        return nom;
    }

    public Modul setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public List<UF> getUfs() {
        return ufs;
    }

    public Modul setUfs(List<UF> ufs) {
        this.ufs = ufs;
        return this;
    }
}
