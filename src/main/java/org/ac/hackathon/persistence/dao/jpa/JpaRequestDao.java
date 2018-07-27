package org.ac.hackathon.persistence.dao.jpa;

import org.ac.hackathon.persistence.model.Requests;
import org.ac.hackathon.persistence.dao.RequestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by codecadet on 26/07/2018.
 */
@Repository
public class JpaRequestDao extends GenericJpaDao<Requests> implements RequestDao{

    @Autowired
    public JpaRequestDao() {
        super(Requests.class);
    }
}
