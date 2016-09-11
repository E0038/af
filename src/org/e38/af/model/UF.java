package org.e38.af.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by sergi on 9/10/16.
 */
@Entity
public class UF {
    @OneToMany
    private List<Materia> materias;
    @Embedded
    private Periode periodValid;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;

    public UF setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNom() {
        return nom;
    }

    public UF setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public UF setMaterias(List<Materia> materias) {
        this.materias = materias;
        return this;
    }

    public Periode getPeriodValid() {
        return periodValid;
    }

    public UF setPeriodValid(Periode periodValid) {
        this.periodValid = periodValid;
        return this;
    }

    public Long getId() {
        return id;
    }
}
