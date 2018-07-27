package org.ac.hackathon.persistence.dao;

import java.util.List;

/**
 * Created by codecadet on 26/07/2018.
 */
public interface Dao<T>  {


    List<T> findAll();

    T findById(Integer id);

    T saveOrUpdate(T modelObject);

    void delete(Integer id);

}
