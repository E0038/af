package org.e38.af.model;


import javax.persistence.*;
import java.util.Calendar;

@Entity
public class Falta {
    @Column(nullable = false)
    private Calendar tempsFalta = Calendar.getInstance();
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Type tipusFalta;
    @OneToOne
    private Materia materia;
    @Id
    private Long id;

    public Calendar getTempsFalta() {
        return tempsFalta;
    }

    public Falta setTempsFalta(Calendar tempsFalta) {
        this.tempsFalta = tempsFalta;
        return this;
    }

    public Type getTipusFalta() {
        return tipusFalta;
    }

    public Falta setTipusFalta(Type tipusFalta) {
        this.tipusFalta = tipusFalta;
        return this;
    }

    public Materia getMateria() {
        return materia;
    }

    public Falta setMateria(Materia materia) {
        this.materia = materia;
        return this;
    }

    public Long getId() {
        return id;
    }

    enum Type {
        JUSTIFICADA,
        VAGA,
        RETARD,
        FALTA
    }
}
