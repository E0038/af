package org.e38.af.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Horari {
    @OneToMany
    private List<Materia> materias;
    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public Horari setId(Integer id) {
        this.id = id;
        return this;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public Horari setMaterias(List<Materia> materias) {
        this.materias = materias;
        return this;
    }
}
