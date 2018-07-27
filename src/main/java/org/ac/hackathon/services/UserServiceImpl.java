package org.ac.hackathon.services;

import org.ac.hackathon.persistence.model.Requests;
import org.ac.hackathon.persistence.model.User;
import org.ac.hackathon.persistence.dao.RequestDao;
import org.ac.hackathon.persistence.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by codecadet on 26/07/2018.
 */
@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private RequestDao requestDao;


    @Override
    public User getUser(Integer id) {
        return userDao.findById(id);
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Autowired
    public void setRequestDao(RequestDao requestDao) {
        this.requestDao = requestDao;
    }

    @Transactional
    @Override
    public User save(User user) {

        return userDao.saveOrUpdate(user);
    }

    @Transactional
    @Override
    public void delete(Integer id) {

        userDao.delete(id);

    }

    @Transactional
    @Override
    public List<Requests> list(Integer id) {
        User user = userDao.findById(id);

        if (user == null) {
            throw new IllegalArgumentException("User does not exist");
        }

        return user.getRequests();

    }

    @Transactional
    @Override
    public String listFoodPreferences(Integer id) {
        User user = userDao.findById(id);

        if (user == null) {
            throw new IllegalArgumentException("Customer does not exist");
        }

        return user.getFoodPreferences();

    }
    @Transactional
    @Override
    public String listThemePreferences(Integer id) {

        User user = userDao.findById(id);

        if (user == null) {
            throw new IllegalArgumentException("Customer does not exist");
        }

        return user.getThemePreferences();
    }

    @Transactional
    @Override
    public List<User> findAll(){
        return userDao.findAll();
    }








    @Override
    public void addFoodPreferences(Integer id, Requests requests) {

    }

    @Override
    public void addThemePreferences(Integer id, Requests requests) {

    }

    @Override
    public void addPhoto(String photo) {

    }

    @Override
    public void addContact(String contact) {

    }

    @Override
    public void addPassword(String password) {

    }

    @Override
    public void addLocal(String local) {

    }

    @Override
    public void addName(String name) {

    }
}
