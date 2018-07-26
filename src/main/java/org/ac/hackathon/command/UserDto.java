package org.ac.hackathon.command;

import org.ac.hackathon.Requests;

import java.util.LinkedList;

/**
 * Created by codecadet on 26/07/2018.
 */
public class UserDto {

    private int id;
    private String name;
    private String local;
    private String contact;
    private String photo;

    private LinkedList<String> foodPreferences;
    private LinkedList <String> themePreferences;
    private LinkedList <Requests> requests;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public LinkedList<String> getFoodPreferences() {
        return foodPreferences;
    }

    public void setFoodPreferences(LinkedList<String> foodPreferences) {
        this.foodPreferences = foodPreferences;
    }

    public LinkedList<String> getThemePreferences() {
        return themePreferences;
    }

    public void setThemePreferences(LinkedList<String> themePreferences) {
        this.themePreferences = themePreferences;
    }

    public LinkedList<Requests> getRequests() {
        return requests;
    }

    public void setRequests(LinkedList<Requests> requests) {
        this.requests = requests;
    }
}
