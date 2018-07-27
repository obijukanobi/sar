package org.ac.hackathon.persistence.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by codecadet on 26/07/2018.
 */
@Entity
@Table(name = "user")
public class User {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Version
    private Integer version;

    @CreationTimestamp
    private Date creationTime;

    @UpdateTimestamp
    private Date updateTime;


    private String name;
    private String local;
    private String contact;
    private String password;
    private String photo;

    private List<String> foodPreferences;
    private List<String> themePreferences;

    @OneToMany(
            // propagate changes on customer entity to account entities
            cascade = {CascadeType.ALL},

            // make sure to remove accounts if unlinked from customer
            orphanRemoval = true,

            // use user foreign key on account table to establish
            // the many-to-one relationship instead of a join table
            mappedBy = "userId",

            // fetch accounts from database together with user
            fetch = FetchType.EAGER
    )
    private List<Requests> requests;


    public Integer getId() {
        return id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public List<String> getFoodPreferences() {
        return foodPreferences;
    }

    public void setFoodPreferences(List<String> foodPreferences) {
        this.foodPreferences = foodPreferences;
    }

    public List<String> getThemePreferences() {
        return themePreferences;
    }

    public void setThemePreferences(List<String> themePreferences) {
        this.themePreferences = themePreferences;
    }

    public List<Requests> getRequests() {
        return requests;
    }

    public void setRequests(List<Requests> requests) {
        this.requests = requests;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", local='" + local + '\'' +
                ", contact='" + contact + '\'' +
                ", password='" + password + '\'' +
                ", photo='" + photo + '\'' +
                ", foodPreferences=" + foodPreferences +
                ", themePreferences=" + themePreferences +
                ", requests=" + requests +
                '}';
    }
}
