package org.e38.af.model;

import javax.persistence.*;
import java.util.List;


@Entity
public class Profesor {
    @Embedded
    private Contacte dadesContacte;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codiProfesor;
//    @ElementCollection
    @OneToMany
    private List<Materia> materias;

    public Contacte getDadesContacte() {
        return dadesContacte;
    }

    public Profesor setDadesContacte(Contacte dadesContacte) {
        this.dadesContacte = dadesContacte;
        return this;
    }

    public Long getCodiProfesor() {
        return codiProfesor;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public Profesor setMaterias(List<Materia> materias) {
        this.materias = materias;
        return this;
    }
}
