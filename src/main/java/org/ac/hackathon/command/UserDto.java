package org.ac.hackathon.command;

import org.ac.hackathon.persistence.model.Requests;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by codecadet on 26/07/2018.
 */

public class UserDto {

    private Integer id;
    private String name;
    private String local;
    private String contact;
    private String photo;
    private String password;

    private String foodPreferences;
    private String themePreferences;
    private List<Requests> requests;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getFoodPreferences() {
        return foodPreferences;
    }

    public void setFoodPreferences(String foodPreferences) {
        this.foodPreferences = foodPreferences;
    }

    public String getThemePreferences() {
        return themePreferences;
    }

    public void setThemePreferences(String themePreferences) {
        this.themePreferences = themePreferences;
    }

    public List<Requests> getRequests() {
        return requests;
    }

    public void setRequests(List<Requests> requests) {
        this.requests = requests;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserDto)) return false;

        UserDto userDto = (UserDto) o;

        if (contact != null ? !contact.equals(userDto.contact) : userDto.contact != null) return false;
        return password != null ? password.equals(userDto.password) : userDto.password == null;
    }

    @Override
    public int hashCode() {
        int result = contact != null ? contact.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
