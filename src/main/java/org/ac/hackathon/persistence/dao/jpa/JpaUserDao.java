package org.ac.hackathon.persistence.dao.jpa;

import org.ac.hackathon.persistence.model.User;
import org.ac.hackathon.persistence.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by codecadet on 26/07/2018.
 */
@Repository
public class JpaUserDao extends GenericJpaDao<User> implements UserDao {

    @Autowired
    public JpaUserDao() {
        super(User.class);
    }
}
