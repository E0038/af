package org.e38.af.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Contacte {
    @Column(length = 50)
    private String name, lastname1, lastname2;
    private String phone;
    @Column(length = 9, nullable = true, unique = true)
    private String nif;
    private String email;
    private String cp;

    public String getName() {
        return name;
    }

    public Contacte setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastname1() {
        return lastname1;
    }

    public Contacte setLastname1(String lastname1) {
        this.lastname1 = lastname1;
        return this;
    }

    public String getLastname2() {
        return lastname2;
    }

    public Contacte setLastname2(String lastname2) {
        this.lastname2 = lastname2;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Contacte setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getNif() {
        return nif;
    }

    public Contacte setNif(String nif) {
        this.nif = nif;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Contacte setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getCp() {
        return cp;
    }

    public Contacte setCp(String cp) {
        this.cp = cp;
        return this;
    }
}
