package org.ac.hackathon.services;

import org.ac.hackathon.persistence.model.Requests;

/**
 * Created by codecadet on 27/07/2018.
 */
public interface RequestService {

    Requests getRequest(Integer id);


    Requests save(Requests requests);


    void delete(Integer id);


}


