/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Persistence.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.log4j.Logger;

/**
 *
 * @author Nicolás
 * @param <T>
 */
public class Repository<T> implements IRepository<T>, Serializable {

    private EntityManagerFactory emf = null;
    private final Class<T> entity;
    private static final Logger logger = Logger.getLogger(Repository.class);

    public Repository(Class<T> entity) {
        emf = Persistence.createEntityManagerFactory("JavaPostgreSQLExamplePU");
        this.entity = entity;
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
        } catch (Exception ex) {
            logger.error(ex);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public T find(int id) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            return em.find(this.entity, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void Edit(int id, T object) {
        EntityManager em = null;
        try {
            var e = find(id);
            if (e == null) {
                throw new NonexistentEntityException("Item with id " + id + " no longer exists.");
            }
            em = getEntityManager();
            em.getTransaction().begin();
            object = em.merge(object);
            em.getTransaction().commit();
        } catch (Exception ex) {
            logger.error(ex);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
