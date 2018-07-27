package org.ac.hackathon.services;

import org.ac.hackathon.persistence.dao.RequestDao;
import org.ac.hackathon.persistence.model.Requests;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by codecadet on 27/07/2018.
 */
public class RequestServiceImpl implements RequestService {

    RequestDao requestDao;

    @Transactional
    @Override
    public Requests getRequest(Integer id) {

        return requestDao.findById(id);
    }

    @Transactional
    @Override
    public Requests save(Requests requests) {
        return null;
    }

    @Transactional
    @Override
    public void delete(Integer id) {

    }
}
