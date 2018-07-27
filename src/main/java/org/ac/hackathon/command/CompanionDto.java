package org.ac.hackathon.command;

import org.ac.hackathon.Requests;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;

/**
 * Created by codecadet on 26/07/2018.
 */

@Repository
public class CompanionDto {

    private Integer did;
    private String name;
    private String local;
    private String contact;
    private String photo;


    public Integer getId() {
        return did;
    }

    public void setDid(Integer id) {
        this.did = did;
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


}
