package org.e38.af.persistance;


import javax.persistence.*;
import java.util.List;
import java.util.Map;


@PersistenceContext
public class DbManager {
    public static final int EXTERNAL_PORT = 8081, LOCAL_PORT = 1521;
    private static DbManager ourInstance = new DbManager();
    private final EntityManager entityManager;

    private DbManager() {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("mysql_local");
        entityManager = managerFactory.createEntityManager();
    }

    private boolean checkExternalAcces() {
        return true;
    }

    public static DbManager getInstance() {
        return ourInstance;
    }

    private boolean checkLocalAcces() {
        return true;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void prepareEnv() {
    }

    public void insert(Object obj) throws PersistanceExeception {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(obj);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            throw new PersistanceExeception(e.getMessage());
        }
    }

//    private void entityGuard(IModelMarker obj) throws NoSuchEntityExeception {
//        if (!obj.getClass().isAnnotationPresent(Entity.class))
//            throw new NoSuchEntityExeception("not a Entity");
//    }

    public void update(Object obj) throws PersistanceExeception {
//        entityGuard(obj);
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(obj);
            entityManager.getTransaction().commit();

        } catch (Exception e) {
//            e.printStackTrace();
            throw new PersistanceExeception(e.getMessage());
        }
    }

    public List<? extends Object> selectAll(Class<? extends Object> aClass) throws NoSuchEntityExeception {
        if (!aClass.isAnnotationPresent(Entity.class))
            throw new NoSuchEntityExeception("not a Entity");
        String name = aClass.getSimpleName();
        return entityManager.createQuery("SELECT p FROM " + name + " p ", aClass).getResultList();
    }

    public void delete(Object obj) throws PersistanceExeception {
//        entityGuard(obj);
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(obj);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            throw new PersistanceExeception(e.getMessage());
        }
    }

    public void reconfigure(Map<String, Object> propeties) {
        for (String key : propeties.keySet()) {
            entityManager.setProperty(key, propeties.get(key));
        }
    }
}
