package org.e38.af.model;

import javax.persistence.*;
import java.time.DayOfWeek;


@Entity
public class Materia {

    @Enumerated(EnumType.ORDINAL)
    private DayOfWeek dayOfWeek;

    @SuppressWarnings("JpaDataSourceORMInspection")
    @AttributeOverrides({
            @AttributeOverride(name = "hour", column = @Column(name = "startHour", length = 2)),
            @AttributeOverride(name = "minute", column = @Column(name = "startMinute", length = 2))
    })
    @Embedded
    private HourMinute timeStart;
    @SuppressWarnings("JpaDataSourceORMInspection")
    @AttributeOverrides({
            @AttributeOverride(name = "hour", column = @Column(name = "endHour", length = 2)),
            @AttributeOverride(name = "minute", column = @Column(name = "endMinute", length = 2))
    })
    @Embedded
    private HourMinute timeEnd;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Profesor profesor;
    private String nom;
    @Embedded
    private Periode periodValid;

    public String getNom() {
        return nom;
    }

    public Materia setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Materia setProfesor(Profesor profesor) {
        this.profesor = profesor;
        return this;
    }

//    public Periode getPeriodValid() {
//        return periodValid;
//    }
//
//    public Materia setPeriodValid(Periode periodValid) {
//        this.periodValid = periodValid;
//        return this;
//    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public Materia setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    public HourMinute getTimeStart() {
        return timeStart;
    }

    public Materia setTimeStart(HourMinute timeStart) {
        this.timeStart = timeStart;
        return this;
    }

    public HourMinute getTimeEnd() {
        return timeEnd;
    }

    public Materia setTimeEnd(HourMinute timeEnd) {
        this.timeEnd = timeEnd;
        return this;
    }

    public Long getId() {
        return id;
    }
}
