package org.ac.hackathon.services;

import org.ac.hackathon.persistence.model.Requests;
import org.ac.hackathon.persistence.model.User;

import java.util.List;

/**
 * Created by codecadet on 26/07/2018.
 */
public interface UserService {

    /**
     * Gets the user with the given id
     *
     * @param id the user id
     * @return the user
     */
    User getUser(Integer id);


    /**
     * Saves a User
     *
     * @param user the user to save
     * @return the saved user
     */
    User save(User user);

    /**
     * Deletes a user
     *
     * @param id the user id
     */
    void delete(Integer id);

    /**
     * Gets a list of the requests
     *
     * @return the request list
     */
    List<Requests> list(Integer id);

    /**
     * Gets the list of foodPreferences
     *
     * @param id the user id
     * @return the list of foodPreferences of the user
     */
    List<String> listFoodPreferences(Integer id);


    /**
     * Gets the list of themePreferences
     *
     * @param id the user id
     * @return the list of themePreferences of the user
     */
    List<String> listThemePreferences(Integer id);


    public List<User> findAll();


    /**
     * Adds requests to the foodPreferences
     *
     * @param id       foodPreferences id
     * @param requests the theme to add
     */
    void addFoodPreferences(Integer id, Requests requests);


    /**
     * Adds a requests to the themePreferences
     *
     * @param id       themePreferences id
     * @param requests the theme to add
     */
    void addThemePreferences(Integer id, Requests requests);

    void addPhoto(String photo);

    void addContact(String contact);

    void addPassword(String password);

    void addLocal(String local);

    void addName(String name);



}
