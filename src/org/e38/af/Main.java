package org.e38.af;

import org.e38.af.model.Alumne;
import org.e38.af.model.Contacte;
import org.e38.af.model.Profesor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 * Created by sergi on 9/10/16.
 */
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("mysql_local");
        EntityManager manager = managerFactory.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(
                new Profesor()
                .setDadesContacte(new Contacte()
                        .setName("prof1")));
        manager.getTransaction().commit();
        System.out.println("END OK");

    }
}
