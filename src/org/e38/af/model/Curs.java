package org.e38.af.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by sergi on 9/10/16.
 */
@Entity
public class Curs {
    @Id
    private Long id;
    private String nom;
    @OneToMany
    private List<Group> groups;

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public Curs setNom(String nom) {
        this.nom = nom;
        return this;
    }
    public List<Group> getGroups() {
        return groups;
    }

    public Curs setGroups(List<Group> groups) {
        this.groups = groups;
        return this;
    }
}
