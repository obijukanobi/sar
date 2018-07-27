package org.ac.hackathon.services;

import org.ac.hackathon.Requests;
import org.ac.hackathon.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by codecadet on 26/07/2018.
 */
@Service
public class UserServiceimpl implements UserService {



    @Override
    public User getUser(Integer id) {
        return null;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Requests> list() {
        return null;
    }

    @Override
    public List<String> listFoodPreferences(Integer id) {
        return null;
    }

    @Override
    public List<String> listthemePreferences(Integer id) {
        return null;
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
