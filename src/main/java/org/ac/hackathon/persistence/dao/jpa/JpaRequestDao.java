package org.ac.hackathon.persistence.dao.jpa;

import org.ac.hackathon.Requests;
import org.ac.hackathon.persistence.dao.RequestDao;

/**
 * Created by codecadet on 26/07/2018.
 */
public class JpaRequestDao extends GenericJpaDao<Requests> implements RequestDao{


    public JpaRequestDao() {
        super(Requests.class);
    }
}
