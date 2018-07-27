package org.ac.hackathon.persistence.dao.jpa;

import org.ac.hackathon.persistence.dao.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by codecadet on 26/07/2018.
 */
public abstract class GenericJpaDao<T>  implements Dao<T>{

    protected Class<T> modelType;

    @PersistenceContext
    protected EntityManager em;

    public GenericJpaDao(Class<T> modelType) {
        this.modelType = modelType;
    }


    public void setEm(EntityManager em) {
        this.em = em;
    }


    @Override
    public List<T> findAll() {


        CriteriaQuery<T> criteriaQuery = em.getCriteriaBuilder().createQuery(modelType);
        Root<T> root = criteriaQuery.from(modelType);
        return em.createQuery(criteriaQuery).getResultList();
   }

    @Override
    public T findById(Integer id) {
        return em.find(modelType, id);
    }

    @Override
    public T saveOrUpdate(T modelObject) {
        return em.merge(modelObject);
    }


    @Override
    public void delete(Integer id) {
        em.remove(em.find(modelType, id));
    }
}

