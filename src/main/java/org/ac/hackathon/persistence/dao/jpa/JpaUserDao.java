package org.ac.hackathon.persistence.dao.jpa;

import org.ac.hackathon.User;
import org.ac.hackathon.persistence.dao.UserDao;

/**
 * Created by codecadet on 26/07/2018.
 */
public class JpaUserDao extends GenericJpaDao<User> implements UserDao {


    public JpaUserDao() {
        super(User.class);
    }
}
