package org.e38.af.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by sergi on 9/10/16.
 */
@Entity
public class Alumne {
    @Embedded
    private Contacte dadesContacte;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codiAlumne;
    @ManyToOne
    private Curs curs;
    @ManyToMany
    private List<Group> group;
    @ManyToMany
    private List<Falta> faltas;
    private int codiSaga;

    public Alumne setCodiAlumne(Long codiAlumne) {
        this.codiAlumne = codiAlumne;
        return this;
    }

    public Alumne setGroup(List<Group> group) {
        this.group = group;
        return this;
    }

    public int getCodiSaga() {
        return codiSaga;
    }

    public Alumne setCodiSaga(int codiSaga) {
        this.codiSaga = codiSaga;
        return this;
    }

    public Contacte getDadesContacte() {
        return dadesContacte;
    }

    public Alumne setDadesContacte(Contacte dadesContacte) {
        this.dadesContacte = dadesContacte;
        return this;
    }

    public Long getCodiAlumne() {
        return codiAlumne;
    }


    public Curs getCurs() {
        return curs;
    }

    public Alumne setCurs(Curs curs) {
        this.curs = curs;
        return this;
    }

    public List<Falta> getFaltas() {
        return faltas;
    }

    public Alumne setFaltas(List<Falta> faltas) {
        this.faltas = faltas;
        return this;
    }
}
