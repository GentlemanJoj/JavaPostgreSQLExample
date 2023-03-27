/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Persistence.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Nicolás
 * @param <T>
 */
public class Repository<T> implements IRepository<T>, Serializable {

    private EntityManagerFactory emf = null;
    private final Class<T> clazz;

    public Repository(Class<T> clazz) {
        emf = Persistence.createEntityManagerFactory("JavaPostgreSQLExamplePU");
        this.clazz = clazz;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    @Override
    public void Add(T object) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public T find(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(this.clazz, id);
        } finally {
            em.close();
        }
    }

    @Override
    public void Edit(T object){
    }
}
